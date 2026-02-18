/**
 * 	Mark enters randomly twenty five numbers from the keyboard and stores it into an
	array. He wants to search if the number is present in the array and if it is present, he
	needs to display the number of times it appears in the array. 
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class SearchAndCountDynamic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[25];

        System.out.println("Enter 25 numbers:");

        for(int i = 0; i < 25; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int count = 0;

        for(int i = 0; i < 25; i++){
            if(arr[i] == key){
                count++;
            }
        }
        if(count > 0){
            System.out.println("Number is present");
            System.out.println("It appears " + count + " times");
        }
        else{
            System.out.println("Number is not present");
        }

	}

}
