/**
 * 	Write a program to count a total number of duplicate and unique elements in the
	given array.

 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class CountDuplicateUniqueDynamic {

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

        int dupli = 0;
        int uni = 0;

        for(int i = 0; i < n; i++){

            int count = 0;

            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > 1){
                dupli++;
            }
            else{
                uni++;
            }
        }

        System.out.println("No of duplicate elements: " + (dupli / 2));
        System.out.println("No of unique elements: " + uni);


	}

}
