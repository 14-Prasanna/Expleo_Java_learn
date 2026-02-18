/**
 * 	Write a program using if statement to check whether the blood donor is eligible or not
	for donating blood. The rules laid down are as follows.
		a. Age should be above 18 yrs but less than 55 yrs.
		b. Weight should be more than 45kg.

 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class BloodDonor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int age, wt;

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter weight: ");
        wt = sc.nextInt();

        if (age > 18 && age < 55 && wt > 45)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");

	}

}
