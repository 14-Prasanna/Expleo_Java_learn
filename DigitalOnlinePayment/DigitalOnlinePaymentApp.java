package DigitalOnlinePayment;


import java.util.Scanner;


abstract class Payment {

    private String transactionId;
    private double amount;
    private String customerName;
    private String paymentStatus;

    public Payment(String transactionId, double amount, String customerName, String paymentStatus) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerName = customerName;
        this.paymentStatus = paymentStatus;
    }

    abstract public boolean validatePayment();
    abstract public boolean processPayment();

    public void executeTransaction() {

        System.out.println("\n-----------------------------------");

        if (validatePayment()) {
            if (processPayment()) {
                setPaymentStatus("SUCCESS");
                System.out.println("\nTransaction Successful");
            } else {
                setPaymentStatus("FAILED");
                System.out.println("\nTransaction Failed");
            }
        } else {
            setPaymentStatus("INVALID");
            System.out.println("\nValidation Failed");
        }

        System.out.println(generateReceipt());
        System.out.println("-----------------------------------\n");
    }

    public String generateReceipt() {
        return "\n           PAYMENT RECEIPT\n" +
                "-----------------------------------\n" +
                "Transaction ID  : " + transactionId + "\n" +
                "Customer Name   : " + customerName + "\n" +
                "Amount          : " + amount + "\n" +
                "Payment Status  : " + paymentStatus + "\n";
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}

class CreditCardPayment extends Payment {

    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String transactionId, double amount, String customerName,
                             String paymentStatus, String cardNumber, String cvv, String expiryDate) {

        super(transactionId, amount, customerName, paymentStatus);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public boolean validatePayment() {
        return cardNumber.length() == 16 && cvv.length() == 3 && expiryDate.matches("(0[1-9]|1[0-2])/\\d{2}");

    }

    public boolean processPayment() {
        return true;
    }
}


class NetBankingPayment extends Payment {

    private String accountNumber;
    private String ifscCode;

    public NetBankingPayment(String transactionId, double amount, String customerName,
                             String paymentStatus, String accountNumber, String ifscCode) {

        super(transactionId, amount, customerName, paymentStatus);
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public boolean validatePayment() {
        return accountNumber.length() >= 8 && ifscCode.length() == 11;
    }

    public boolean processPayment() {
        return true;
    }
}


class UPIPayment extends Payment {

    private String upiId;
    private String upiPin;

    public UPIPayment(String transactionId, double amount, String customerName,
                      String paymentStatus, String upiId, String upiPin) {

        super(transactionId, amount, customerName, paymentStatus);
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    public boolean validatePayment() {
        return upiId.contains("@") && upiPin.length() == 4;
    }

    public boolean processPayment() {
        return true;
    }
}


public class DigitalOnlinePaymentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment payment = null;

        System.out.println("Choose Payment Method");
        System.out.println("1. Credit Card");
        System.out.println("2. Net Banking");
        System.out.println("3. UPI");

        System.out.println("Enter the choose: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Transaction ID: ");
        String transactionId = sc.nextLine();

        System.out.print("Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        switch(choice){

            case 1:
                System.out.print("Card Number: ");
                String card = sc.nextLine();

                System.out.print("CVV: ");
                String cvv = sc.nextLine();
                
                System.out.print("Expiry Date (MM/YY): ");
                String exp = sc.nextLine();


                payment = new CreditCardPayment(transactionId,amount,customerName,"PENDING",card,cvv,exp);
                break;

            case 2:
                System.out.print("Account Number: ");
                String acc = sc.nextLine();

                System.out.print("IFSC: ");
                String ifsc = sc.nextLine();

                payment = new NetBankingPayment(transactionId,amount,customerName,"PENDING",acc,ifsc);
                break;

            case 3:
                System.out.print("UPI ID: ");
                String upi = sc.nextLine();

                System.out.print("UPI PIN: ");
                String pin = sc.nextLine();

                payment = new UPIPayment(transactionId,amount,customerName,"PENDING",upi,pin);
                break;
        }

        payment.executeTransaction();
    }
}