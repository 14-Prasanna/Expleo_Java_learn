/**
 * 
 */
package arrays_learn;

import java.util.Scanner;

/**
 * 
 */
public class JaggedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int array[][] = new int[3][];
		
		 	array[0] = new int[3];
	        array[1] = new int[2];
	        array[2] = new int[5];

		
		for(int i=0;i<3;i++) {
			array[0][i] = sc.nextInt();
		}
		
		for(int i=0;i<2;i++) {
			array[1][i] = sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			array[2][i] = sc.nextInt();
		}
		
		
		System.out.println("----------------------- The Dynamic Array JaggedArray in 2D -------------------");
		
		for(int j=0;j<array[0].length;j++) {
				System.out.print(array[0][j] + " ");
		}
		
		for(int j=0;j<array[1].length;j++) {
			System.out.print(array[1][j] + " ");
	}
		
		for(int j=0;j<array[2].length;j++) {
			System.out.print(array[2][j]+" ");
	}
		

	}

}
