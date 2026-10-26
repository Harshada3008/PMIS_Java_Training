
package com.bank;

import java.math.BigDecimal;

public class Account {
    private int accountId;
    private String customerName;
    private String phone;
    private String address;
    private String accountType;
    private BigDecimal balance;

    public Account(int accountId, String customerName,
                   String phone, String address,
                   String accountType, BigDecimal balance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Account(String customerName, String phone,
                   String address, String accountType,
                   BigDecimal balance) {
        this(0, customerName, phone, address,
                accountType, balance);
    }

    public int getAccountId() {
        return accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountType() {
        return accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

