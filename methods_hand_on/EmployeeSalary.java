/**
 * 	The employees working in Sugan Factory are paid Rs.15.00 per hour if they work
	overtime for more than 40 hours. Consider that the employees do not work for
	fractional part of an hour. Write a C program to calculate overtime pay for 5
	employees
 */
package methods_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class EmployeeSalary {

	public static float salary(int h) {
		
		return (float) (h * 15.00);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float sum = 0;
		
		System.out.println("Enter the 5 employee working time");
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			if(arr[i] <= 40) {
				System.out.println("The employee is not working overtime " + arr[i]);
			}
			else {
				float a1 = salary(arr[i]);
				sum = sum + a1;
			}
			
		}
		
		System.out.println("The overtime payment of all employees " + (float)(sum));
		
		sc.close();

	}

}
