/**
 * 
 */
package ConditionalStatement_learn;

import java.util.Scanner;

/**
 * 
 */
public class AnotherBasicIfCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean  a = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the seat number");
		String s = sc.next();
		
		if(a) {
			System.out.println("The ticket is booked " + s);
		}
		else {
			System.out.println("Vaipu ila raja ");
		}
		
		sc.close();
		

	}

}
