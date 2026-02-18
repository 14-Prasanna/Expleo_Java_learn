/**
 * 
 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * Write a program using do-while loop to evaluate the series 1+2+3+…..+i
 */
public class SeriesSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
        int n, i = 1, sum = 0;

        System.out.print("Enter value: ");
        n = sc.nextInt();

        do {
            sum = sum + i;
            i++;
        } while (i <= n);

        System.out.println("Sum = " + sum);

	}

}
