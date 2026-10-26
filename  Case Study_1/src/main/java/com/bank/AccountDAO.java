
package com.bank;

import java.sql.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    // CREATE: Add a new bank account
    public boolean addAccount(Account account) {
        String sql = "INSERT INTO accounts " +
                "(customer_name, phone, address, account_type, balance) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, account.getCustomerName());
            ps.setString(2, account.getPhone());
            ps.setString(3, account.getAddress());
            ps.setString(4, account.getAccountType());
            ps.setBigDecimal(5, account.getBalance());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Add account error: " + e.getMessage());
            return false;
        }
    }

    // READ: Display all bank accounts
    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM accounts";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Account account = new Account(
                        rs.getInt("account_id"),
                        rs.getString("customer_name"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("account_type"),
                        rs.getBigDecimal("balance")
                );

                accounts.add(account);
            }

        } catch (SQLException e) {
            System.out.println("Read error: " + e.getMessage());
        }

        return accounts;
    }

    // UPDATE: Change customer details
    public boolean updateAccount(Account account) {
        String sql = "UPDATE accounts SET customer_name=?, " +
                "phone=?, address=?, account_type=?, balance=? " +
                "WHERE account_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, account.getCustomerName());
            ps.setString(2, account.getPhone());
            ps.setString(3, account.getAddress());
            ps.setString(4, account.getAccountType());
            ps.setBigDecimal(5, account.getBalance());
            ps.setInt(6, account.getAccountId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
            return false;
        }
    }

    // DELETE: Remove an account
    public boolean deleteAccount(int accountId) {
        String sql = "DELETE FROM accounts WHERE account_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
            return false;
        }
    }
}

