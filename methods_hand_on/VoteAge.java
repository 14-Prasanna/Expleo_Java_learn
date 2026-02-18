/**
 *  A person is elligible to vote if his/her age is greater than or equal to 18. Define a
	method to find out if he/she is elligible to vote
 */
package methods_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class VoteAge {

	public static boolean vote(int num) {
		

		if(num >=18) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		
		if(age < 0) {
			System.out.println("Venum nu negative number kudukarala soo marupatiyum re-run pannu pooo...");
		}
		else {
		
		if(vote(age)) {
			System.out.println("Elligible for vote");
		}
		else {
			System.out.println("Not Elligible for vote");
		}
		}
		
		sc.close();

	}

}
