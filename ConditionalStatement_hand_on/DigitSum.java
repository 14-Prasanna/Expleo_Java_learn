/**
 *  Write a program to print sum of digits of a given number.

 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class DigitSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
        int num, sum = 0, rem;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);

	}

}
