/**
 * 
 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * Write a program to check whether the given number is divisor of 7 using simple if
	statement.
 */
public class DivisibleSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        if (num % 7 == 0)
            System.out.println("Divisible by 7");
        else
            System.out.println("Not Divisible by 7");


	}

}
