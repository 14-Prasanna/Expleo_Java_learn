/**
 * 	Write a program to check whether the given Character is an Alphabet/ Digit /Special
	Symbol using if-else-if statement
 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class CharType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        char ch;

        System.out.print("Enter character: ");
        ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Symbol");
	}

}
