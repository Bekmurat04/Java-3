package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount += sum;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств:" + amount,amount);

        }
        return amount = amount - sum;
    }

}


