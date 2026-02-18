/**
 * 	In a school there are Indian, NRI and Foreigners studying. Their heights are given in
	three different values. To represent their class, they need to stand in height order in
	a single line. Given three arrays X, Y, Z of different sizes M, N and O, write a
	program to merge the three arrays and make it a single sorted array.

 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class MergeThreeArraysSorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] X = new int[m];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < m; i++){
            X[i] = sc.nextInt();
        }

       
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] Y = new int[n];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n; i++){
            Y[i] = sc.nextInt();
        }

        System.out.print("Enter size of third array: ");
        int o = sc.nextInt();
        int[] Z = new int[o];

        System.out.println("Enter elements of third array:");
        for(int i = 0; i < o; i++){
            Z[i] = sc.nextInt();
        }

       
        int[] merged = new int[m + n + o];
        int index = 0;

        for(int i = 0; i < m; i++){
            merged[index++] = X[i];
        }

        for(int i = 0; i < n; i++){
            merged[index++] = Y[i];
        }

        for(int i = 0; i < o; i++){
            merged[index++] = Z[i];
        }

       
        for(int i = 0; i < merged.length - 1; i++){
            for(int j = 0; j < merged.length - 1 - i; j++){
                if(merged[j] > merged[j + 1]){
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }
        
    
        System.out.println("Sorted merged array:");
        for(int i = 0; i < merged.length; i++){
            System.out.print(merged[i] + " ");
        }

	}

}
