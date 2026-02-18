/**
 * 		Write a program to print the following number pattern
 */
package ConditionalStatement_hand_on;

/**
 * 
 */
public class NumPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

	}

}
