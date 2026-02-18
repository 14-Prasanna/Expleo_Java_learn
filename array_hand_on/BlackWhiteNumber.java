/**
 * 	Consider the program that reads integers from the standard input (until it gets a
	negetive number) and puts them into an array. 
	
	After that it calls processArray on the
	array, and then prints the contents of the array on standard output.
	
	For this question, we define a black number as any number that is divisible by 7, and
	a white number that is divisible by 8.
	
	Currently, processArray does not modify the array. You have to change this program
	so that any number in the array is replaced by -2 if it is a blck number, with -9 if it is
	a white number, and with -6 if it is both a black and white number.
	
	To do this, you have to put your code inside processArray. Do not change anything else in the
	program.
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class BlackWhiteNumber {
	
	public static void processArray(int[] arr, int size) {

        for(int i = 0; i < size; i++) {

            boolean isBlack = (arr[i] % 7 == 0);   
            boolean isWhite = (arr[i] % 8 == 0);   

            if(isBlack && isWhite) {
                arr[i] = -6;     
            }
            else if(isBlack) {
                arr[i] = -2;     
            }
            else if(isWhite) {
                arr[i] = -9;     
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        int[] arr = new int[100];   
	        int size = 0;

	       
	        while(true) {
	            int num = sc.nextInt();

	            if(num < 0) {
	                break;
	            }

	            arr[size] = num;
	            size++;
	        }

	       
	        processArray(arr, size);

	       
	        for(int i = 0; i < size; i++) {
	            System.out.println(arr[i]);
	        }
		

	}

}
