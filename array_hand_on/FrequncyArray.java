


package array_hand_on;

import java.util.Scanner;

public class FrequncyArray {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int freq[] = new int[256];
		
		System.out.print("Enter the no of rows");
		int row = sc.nextInt();
		
		int arr[] = new int[row];
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<row;i++) {
			arr[i] = sc.nextInt();
			freq[arr[i]]++;
		}
		
		for(int i=0;i<256;i++) {
			if(freq[i] != 0) {
				System.out.println("The frequency of the element " + i + " The repeat " + freq[i]);
			}
		}
		
		
	}
}
