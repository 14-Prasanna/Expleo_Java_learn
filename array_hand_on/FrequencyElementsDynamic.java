/**
 * 	Teena having elements as 10,10,10,10,20,20,20,20,40,40,50,50,30 and she
	maintained in the data structure “my_record”. She needs to find the frequency of
	element in my_report and display the count.
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class FrequencyElementsDynamic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){

            int count = 1;
            boolean flag = false;

            for(int k = 0; k < i; k++){
                if(arr[i] == arr[k]){
                    flag = true;
                    break;
                }
            }

            if(flag)
                continue;

            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}