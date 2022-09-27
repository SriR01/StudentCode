package com.techelevator;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        int currentBalance = getBalance();
        // Condition 1: No overdraft
        if (amountToWithdraw < currentBalance) {
            return super.withdraw(amountToWithdraw);
        } else if ((amountToWithdraw > currentBalance) && (currentBalance - amountToWithdraw > -100)) {
            return super.withdraw(amountToWithdraw+10);
        } else if ((amountToWithdraw > currentBalance) && (currentBalance - amountToWithdraw <= -100)) {
            return currentBalance;
        }
        return currentBalance;
    }



}
