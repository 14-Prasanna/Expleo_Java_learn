package ConditionalStatement_hand_on;

import java.util.*;

public class Supermarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        double total = quantity * price;

        if(quantity > 500){
            total = total - (total * 0.15);
        }

        System.out.println("Final Bill: " + total);
	}
}
