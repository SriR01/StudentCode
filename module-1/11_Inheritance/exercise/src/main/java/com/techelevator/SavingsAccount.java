package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        int balance = getBalance() - amountToWithdraw;
        if (balance - 2 < 0) {
            return getBalance();
        }
        if (balance < 150) {
            return super.withdraw(amountToWithdraw + 2);
        } else if (balance - amountToWithdraw > 0) {
            return super.withdraw(amountToWithdraw);
        } else {
            return getBalance();
        }
    }
}
