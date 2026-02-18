/**
 * 
 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * Accepts a string and calculate the number of digits and letters.

 */
public class String_Letter_calculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine().toLowerCase();
		
		int n = s1.length();
		
		int letters = 0, symblos =0, count =0;
		
		int i=0;
		while(i<n) {
			if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				letters++;
			}
			if(s1.charAt(i) == ' ') {
				symblos++;
			}
			i++;
		}
		
		for (char c : s1.toCharArray()) {
	        if (Character.isDigit(c)) {
	            count++;
	        }
	    }
		
		System.out.print("Letters: " + (letters) + " Number: " + (count) + " Other special characters: " + (symblos));
		
	}

}
