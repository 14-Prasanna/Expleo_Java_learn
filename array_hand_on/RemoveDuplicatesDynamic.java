/**
 * 	Ivan has a list of n elements and he need to eliminate the duplicate numbers from
	the list and to create the new list to hold the unique number.
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class RemoveDuplicatesDynamic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of row: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] uni = new int[n];
        int k = 0;

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){

            boolean flag = false;

            for(int j = 0; j < k; j++){
                if(arr[i] == uni[j]){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                uni[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < k; i++){
            System.out.print(uni[i] + " ");
        }

	}

}
