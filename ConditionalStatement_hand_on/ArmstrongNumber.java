package ConditionalStatement_hand_on;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if(sum == originalNumber){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }

	}

}
