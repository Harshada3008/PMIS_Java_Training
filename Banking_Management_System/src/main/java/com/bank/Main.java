
package com.bank;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();

        while (true) {
            System.out.println("\n===== BANKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Update Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter account type (Savings/Current): ");
                    String type = sc.nextLine();

                    System.out.print("Enter opening balance: ");
                    BigDecimal balance;

                    try {
                        balance = new BigDecimal(sc.nextLine());

                        if (balance.compareTo(BigDecimal.ZERO) < 0) {
                            System.out.println("Balance cannot be negative.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid balance.");
                        break;
                    }

                    Account account = new Account(
                            name, phone, address, type, balance);

                    if (dao.addAccount(account)) {
                        System.out.println("Account created successfully!");
                    } else {
                        System.out.println("Account creation failed.");
                    }
                    break;

                case 2:
                    List<Account> accounts = dao.getAllAccounts();

                    if (accounts.isEmpty()) {
                        System.out.println("No accounts found.");
                    } else {
                        System.out.println("\n--- All Bank Accounts ---");

                        for (Account a : accounts) {
                            System.out.println(
                                    "ID: " + a.getAccountId()
                                            + " | Name: " + a.getCustomerName()
                                            + " | Phone: " + a.getPhone()
                                            + " | Address: " + a.getAddress()
                                            + " | Type: " + a.getAccountType()
                                            + " | Balance: " + a.getBalance()
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter account ID to update: ");
                    int updateId;

                    try {
                        updateId = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid account ID.");
                        break;
                    }

                    System.out.print("Enter new customer name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new phone: ");
                    String newPhone = sc.nextLine();

                    System.out.print("Enter new address: ");
                    String newAddress = sc.nextLine();

                    System.out.print("Enter new account type: ");
                    String newType = sc.nextLine();

                    System.out.print("Enter new balance: ");
                    BigDecimal newBalance;

                    try {
                        newBalance = new BigDecimal(sc.nextLine());

                        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                            System.out.println("Balance cannot be negative.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid balance.");
                        break;
                    }

                    Account updatedAccount = new Account(
                            updateId, newName, newPhone,
                            newAddress, newType, newBalance);

                    if (dao.updateAccount(updatedAccount)) {
                        System.out.println("Account updated successfully!");
                    } else {
                        System.out.println("Account not found or update failed.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account ID to delete: ");
                    int deleteId;

                    try {
                        deleteId = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid account ID.");
                        break;
                    }

                    System.out.print("Confirm deletion? (yes/no): ");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("yes")) {
                        if (dao.deleteAccount(deleteId)) {
                            System.out.println("Account deleted successfully!");
                        } else {
                            System.out.println("Account not found or deletion failed.");
                        }
                    } else {
                        System.out.println("Deletion cancelled.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using our banking system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Select 1 to 5.");
            }
        }
    }
}
