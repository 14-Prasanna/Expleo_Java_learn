/**
 *   Given an n-dimensional array A[]. The aim is to identify the greatest element
	therein. 
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class GreatestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Greatest element is: " + max);

	}

}
