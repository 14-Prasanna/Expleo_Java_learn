/**
 * 
 */
package ConditionalStatement_learn;

import java.util.Scanner;

/**
 * 
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 65; // java unicode ya mathi case kuda match aguthu....  
		// case yum char ya check pannama unicode match aguthu nu check pannuthu
		
		switch(a) {
		
		case 'a':
			System.out.print("LowerCase");
			break;
			
		case 'A':
			System.out.print("UpperCase");
			break;
		
			default:
				System.out.print("Thapu....");
				break;
		}

	}

}
