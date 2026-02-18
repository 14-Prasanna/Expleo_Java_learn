/**
 * 2. Write a function to find the prime numbers between 1 to 100.
 */
package methods_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class PrimeNumber {
	
	public static boolean prime(int num) {
		
		boolean flag = false;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter limit from 2 - ");
		int n = sc.nextInt();
		
		if(n <= 2) {
			System.out.print("venum thana 2 vida lower ya kudukara value vera kudu... so marupatiyum re-run pannu....");
		}
		else {
			System.out.println("Prime number from 2 - " +n);
			for(int i=3;i<=n;i++) {
				if(!prime(i)) {
					System.out.print(i + " ");
				}
			}
		}
		
		
		sc.close();
	}

}
