package com.exceptionhandling;

class PayOutOfBoundsException extends Exception{
    PayOutOfBoundsException(String s){
        super(s);
    }
}
class AccountManagement{

    int a = 80000;   
    int b = 30000;   

    
    void checkForDebit(int c) throws PayOutOfBoundsException{

        if(c > b){
            throw new PayOutOfBoundsException("Transaction limit exceeded");
        }

        if(c > a){
            throw new PayOutOfBoundsException("Insufficient balance");
        }
    }

    // withdraw method
    void withdrawAmount(int c) throws PayOutOfBoundsException{

        checkForDebit(c);

        a = a - c;
        System.out.println("Amount Withdrawn: " + c);
        System.out.println("Remaining Balance: " + a);
    }
}



public class Problem_account {
	
	public static void main(String args[]) {
		 AccountManagement x = new AccountManagement();

	        try{
	            x.withdrawAmount(23000);   
	        }
	        catch(Exception e){
	            System.out.println(e.getMessage());
	        }
	    }
}
