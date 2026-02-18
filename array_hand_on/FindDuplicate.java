/**
 *   Write a program to find the duplicate number on a given integer array.

 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class FindDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the no of rows");
		int row = sc.nextInt();
		
		int arr[] = new int[row];
		int freq[] = new int[256];
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<row;i++) {
			arr[i] = sc.nextInt();
			freq[arr[i]]++;
		}
		
		for(int i=0;i<256;i++) {
			if(freq[i] > 1) {
				System.out.println("The Duplicate element " + i);
			}
		}

	}

}
