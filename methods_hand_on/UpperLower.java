/**
 *  Write a C# program to find the sums of the running odd numbers and even numbers
	from a given lowerbound to an upperbound. Also compute their absolute
	difference. (Use separate function to find the sum of odd and even numbers
	from lowerbound to upperbound)
 */
package methods_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class UpperLower {

	public static int sumOdd(int up, int low) {
		int sumOdd = 0;
		for(int i=low;i<up;i++) {
			if(i % 2 != 0) {
				sumOdd += i;
			}
		}
		return sumOdd;
	}
	
	public static int sumEven(int up, int low) {
		int sumEven = 0;
		for(int i=low;i<up;i++) {
			if(i % 2 == 0) {
				sumEven += i;
			}
		}
		return sumEven;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lowerBound: ");
		int low = sc.nextInt();
		
		System.out.print("Enter the upperBound:");
		int up = sc.nextInt();
		
		int a = sumOdd(up, low);
		int b = sumEven(up, low);
		
		System.out.print("The sum of odd numbers from " +  low + " to " + up + "is: " + a);
		System.out.print("\nThe sum of even numbers from " +  low + " to " + up + "is: " + b);
		System.out.print("\nThe absolute difference between the two sums is:" +  Math.abs(a - b));
		
		sc.close();

	}

}
