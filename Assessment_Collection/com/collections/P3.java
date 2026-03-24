package com.collections;

import java.util.Scanner;

abstract class BankTransactionException extends Exception {
    int code;

    BankTransactionException(String message, int code) {
        super(message);
        this.code = code;
    }
}

class InsufficientFundsException extends BankTransactionException {
    InsufficientFundsException(int balance, int amount) {
        super("InsufficientFundsException: Shortfall: " + Math.abs(amount - balance), 102);
    }
}

class InvalidAccountException extends BankTransactionException {
    InvalidAccountException(String accountId) {
        super("InvalidAccountException: Account ID cannot be empty" + accountId, 101);
    }
}

class TransactionLimitException extends BankTransactionException {
    TransactionLimitException(int amount, int limit) {
        super("TransactionLimitException: Limit " + limit, 103);
    }
}

public class P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the accountID");
        String accountId = sc.next();
        System.out.println("Enter the balance amount");
        int balance = sc.nextInt();
        System.out.println("Enter the amount ");
        int amount = sc.nextInt();
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        try {
            if (amount > limit) {
                throw new TransactionLimitException(amount, limit);
            } else if (amount > balance) {
                throw new InsufficientFundsException(balance, amount);
            } else {
                throw new InvalidAccountException(accountId);
            }
        } catch (BankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error Code: " + e.code);
        }
        finally {
        	System.out.println("Validation complete");
        }
        
        sc.close();
    }
}