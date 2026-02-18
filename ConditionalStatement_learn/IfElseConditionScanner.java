/**
 * 
 */
package ConditionalStatement_learn;

import java.util.Scanner;

/**
 * 
 */
public class IfElseConditionScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Type of seats Available\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nchoose any one of the option\n");
		
		String s = sc.next().toUpperCase();
		
		if(s.equals("REGULAR") ) {
			System.out.println("You have selected Seat and Cost is Rs.80");
		}
		else if(s.equals("PREMIUM") ) {
			System.out.println("You have selected Seat and Cost is Rs.120");
		}
		else if(s.equals("EXECUTIVE") ) {
			System.out.println("You have selected Seat and Cost is Rs.160");
		}
		else {
			System.out.println("You have selected Seat and Cost is Rs.200");
		}
		

	}

}
