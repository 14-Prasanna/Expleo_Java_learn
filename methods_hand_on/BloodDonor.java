/**
 * 	Write a function to find whether the blood donor is eligible or not for donating blood.
	The rules laid down are as follows.
		a. Age should be above 18 yrs but not more than 55 yrs.
		b. Weight should be more than 45kg.
 */
package methods_hand_on;

import java.util.Scanner;

public class BloodDonor {

	public static boolean eligible(int age, int w) {
		if(age >18 && age<55) {
			if(w > 45) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		System.out.println("Enter the weight");
		int weight = sc.nextInt();
		
		if(eligible(age,weight)) {
			System.out.println("The human is eligible to blood donor");
		}
		else {
			System.out.println("The human is not eligible to blood donor");
		}
		
		sc.close();
	}

}
