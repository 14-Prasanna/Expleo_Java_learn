/**
 * 
 */
package ConditionalStatement_hand_on;

import java.util.Scanner;

/**
 *  Write a program to get employee details, wages and number of days worked from user
	and find total salary.
 */
public class EmployeeSalary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

        String empName;
        int wage, days, total;

        System.out.print("Enter employee name: ");
        empName = sc.nextLine();

        System.out.print("Enter wage per day: ");
        wage = sc.nextInt();

        System.out.print("Enter number of days worked: ");
        days = sc.nextInt();

        total = wage * days;

        System.out.println("Total Salary of " + empName + " is " + total);

	}

}
