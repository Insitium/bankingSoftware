package com.company;

public class Accounts {
    protected int accountNumber;
    protected double balance;
    protected String type;
    protected double overdraft;
    protected Customer customer;
    protected double withdraw;
    protected double deposit;

    public Accounts() {
    };

    public Accounts(int accountNumber,Customer customer, double balance, String type, double overdraft) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
        this.overdraft = overdraft;
        this.customer = customer;
    }




    public Accounts(int accountNumber, double balance, String type, double overdraft) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
        this.overdraft = overdraft;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void deposit(double depositamount){
        this.balance+=depositamount;
    }
}
