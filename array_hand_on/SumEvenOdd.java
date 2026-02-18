/**
 * 	Write a program to add even and odd numbers from 1 to 10. Store and display their
	results in two separate arrays
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class SumEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of row");
		int row = sc.nextInt();
			
		
		int array[] = new int[row];
		int even = 0, odd = 0;
		
		System.out.print("Enter the number in the array");
		for(int i=0;i<row;i++) {
				array[i] = sc.nextInt();
				
				if(array[i] % 2 == 0) {
					even++;
				}
				else
					odd++;
		}
		
		int evenarr[] = new int[even];
		int oddarr[] = new int[odd];
		
		int count1 = 0, count = 0;
		for(int i=0;i<row;i++) {
			if(array[i] % 2 == 0) {
				evenarr[count++] = array[i]; 
			}
			else 
				oddarr[count1++] = array[i];
		}
		 
		System.out.println("The even values : ");
		for(int i=0;i<even;i++) {
			System.out.println(evenarr[i] + " ");
		}
		System.out.println("The odd values : ");
		for(int i=0;i<odd;i++) {
			System.out.println(oddarr[i] + " ");
		}
		

	}

}
