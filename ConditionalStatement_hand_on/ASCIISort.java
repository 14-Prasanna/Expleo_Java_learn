package ConditionalStatement_hand_on;

import java.util.*;

public class ASCIISort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] arr = new char[n];

        System.out.println("Enter characters (numbers or alphabets):");

        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

      
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted characters based on ASCII:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }


	}

}
