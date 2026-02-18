/**
 * 	Write a program to check whether a specific element is present in this Array or not.

 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class SearchElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of row: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                found = true;
                break;
            }
        }

        System.out.println(found);
		
		

	}

}
