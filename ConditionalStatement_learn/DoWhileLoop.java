/**
 * 
 */
package ConditionalStatement_learn;

/**
 * 
 */
public class DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 5, seat = 0;
		do {
			System.out.println("Current Seat Avaiablity: " + (max-seat) );
			seat ++;
		} while(seat < max);
		
		System.out.println("Seat Filled");

	}

}
