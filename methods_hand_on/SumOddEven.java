/*
 * Write a function to Calculate the Sum of Odd & Even Numbers
 */

package methods_hand_on;

import java.util.Scanner;

public class SumOddEven {
	
	
	public static int even(int arr[]) {
		int sumEven = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2== 0) {
				sumEven += arr[i];
			}
		}
		return sumEven;
	}
	
	public static int odd(int arr[]) {
		int sumOdd = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				sumOdd += arr[i];
			}
		}
		return sumOdd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of row");
		int n = sc.nextInt();
		
		System.out.println("Enter the array values");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The sum of all even numbers: " + even(arr) + "\nThe sum of all odd numbers " + odd(arr));
		
		sc.close();
		

	}

}
