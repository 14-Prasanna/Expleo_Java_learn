/**
 * 	Write a program to find the missing number in a given integer array of 1 to 100.
 */
package array_hand_on;

/**
 * 
 */
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 6, 7, 8, 9, 3, 5,10};
		
		int n = 10;
		
		int result = n*(n+1)/2;
		
		int sum = 0;
		
		for(int num: arr) {
			sum+=num;
		}
		
		int miss = result - sum;
		
		System.out.println("The missing number from 1 - 100 is: " + miss);

	}

}
