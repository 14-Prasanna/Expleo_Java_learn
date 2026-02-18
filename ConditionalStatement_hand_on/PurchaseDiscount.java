package ConditionalStatement_hand_on;

import java.util.*;

public class PurchaseDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

	        double purchaseAmount = price * quantity;
	        double discountAmount;

	        if(purchaseAmount > 1000){
	            discountAmount = purchaseAmount * 0.10;  
	        }
	        else{
	            discountAmount = purchaseAmount * 0.05;  
	        }

	        double paidAmount = purchaseAmount - discountAmount;

	        System.out.println("Purchase Amount: " + purchaseAmount);
	        System.out.println("Discount Amount: " + discountAmount);
	        System.out.println("Paid Amount: " + paidAmount);


	}

}
