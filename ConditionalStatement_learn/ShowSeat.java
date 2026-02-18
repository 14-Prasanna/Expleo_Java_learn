/**
 * 
 */
package ConditionalStatement_learn;

/**
 * 
 */
public class ShowSeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 19, seat= 0;
		
		while(seat < max) {
			System.out.println("Current Seat Avaiablity:" + (max - seat));
			seat++;
		}
		System.out.println("Seat are filled");
	}

}
