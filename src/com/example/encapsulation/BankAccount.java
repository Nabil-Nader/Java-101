package com.example.encapsulation;

public class BankAccount {

    private String owner;

    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance,0);
    }


    public BankAccount() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdrwaAmount(double amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
            return this.balance;
        } else {
            throw new RuntimeException("The amount was to big for the account");
        }
    }

    public String addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return "the amount has been added";
        } else {
            throw new RuntimeException("The amount was to big for the account");
        }
    }
}
