/**
 * 	There are N friends in a group. Each of them has Xi chocolates. Write a program to
	check whether they can share all of these chocolates among themselves such that
	each one of them has equal number of chocolates.
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class EqualChocolates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] chocolates = new int[N];
        int total = 0;

       
        for(int i = 0; i < N; i++){
            chocolates[i] = sc.nextInt();
            total += chocolates[i];
        }

        
        if(total % N == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}

}
