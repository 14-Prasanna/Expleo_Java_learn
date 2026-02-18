/**
 * Get the salary per month and hike from user and the write a C# program to
	calculate new salary with hike.
 */
package methods_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class SalaryHike {

	public static void newSalary(float oddSalary, float hike) {
		
	
		System.out.println("The new salary is: " + (oddSalary + (oddSalary * (hike / 100))));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the old month salary");
		float sal = sc.nextInt();
		
		System.out.print("Enter the hike");
		float hike = sc.nextInt();
		
		newSalary(sal, hike);
		
		sc.close();

	}

}
