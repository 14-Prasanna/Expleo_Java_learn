/**
 * 
 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * Use switch case structure to print the appropriate message to recognize the entered
character is vowel, consonant or symbol.

 */
public class CheckVowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.print("Enter character: ");
        ch = sc.next().charAt(0);

        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    System.out.println("Consonant");
                else
                    System.out.println("Symbol");
        }

	}

}
