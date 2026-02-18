/**
 * To speed up his composition of generating unpredictable rhythms, Aniruth wants the
	list of prime numbers available in a range of numbers. Can you help him out? Write a
	C# program to print all prime numbers in the interval [x,y] (x and y, both
	inclusive).(Use separate function to print all prime numbers in the given interval)

 */
package methods_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class IntervalPrime {
	
	public static boolean prime(int n) {
		
		boolean flag = false;
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first interval");
		int n = sc.nextInt();
		
		System.out.println("Enter the secound interval");
		int n1 = sc.nextInt();
		
		if(n1 < n) {
			System.out.println("Provide valid input");
		}
		else {
		if(n <=1) {
			for(int i= n+1;i<=n1;i++) {
				if(!prime(i)) {
					System.out.print(i + " " );
				}
			}
		}
		}
		
		sc.close();
		

	}

}
