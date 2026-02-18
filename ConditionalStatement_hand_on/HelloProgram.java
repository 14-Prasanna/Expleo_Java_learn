/**
 * Write a program that reads an integer continuously and displays "Hello" as many times
as the value of the integer. If the user enters a negative number, the insertion of
integers should end and the program should display the total number of the displayed
"Hello".
 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class HelloProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
        int num, total = 0;

        while (true) {

            System.out.print("Enter number: ");
            num = sc.nextInt();

            if (num < 0)
                break;

            for (int i = 1; i <= num; i++) {
                System.out.println("Hello");
                total++;
            }
        }

        System.out.println("Total Hello printed: " + total);

	}

}
