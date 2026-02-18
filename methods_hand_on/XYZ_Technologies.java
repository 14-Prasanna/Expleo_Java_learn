/**
 * 		XYZ Technologies is in the process of increment the salary of the employees. This
		increment is done based on their salary and their performance appraisal rating.
			a. If the appraisal rating is between 1 and 4, the increment is 10% of the salary.
			b. If the appraisal rating is between 4.1 and 7, the increment is 25% of the salary.
			c. If the appraisal rating is between 7.1 and 10, the increment is 30% of the salary.
		Help them to do this, by writing a program that displays the incremented salary.
		(Use separate function to calculate the increment)
		Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the
			range 1 to 10 (inclusive), then the output should be “Invalid Input”.
 */
package methods_hand_on;

import java.util.Scanner;

public class XYZ_Technologies {
	
	public static float salary(float s, float r) {
		
		float amt = 0;
		
		if (s <= 0 || r < 1 || r > 10) {
            return 0;
        }
		
		if(r>=1 && r<=4) {
			
				amt = s + (s * 10 /100);
				return amt;
			
		}
		else if(r>=4.1 && r<=7) {
			
				amt = s + (s * 25/100);
				return amt;
			
		}
		else if(r>=7.1 && r<=10) {
			
				amt = s + (s * 30/100);
				return amt;
		}
		
		return amt;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary ");
		float sal = sc.nextFloat();
		
		System.out.println("Enter the apparaisal rating ");
		float rat = sc.nextFloat();
		
		float val = salary(sal, rat);
		
		if(val == 0) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("The salary :" + val);
		}
		
		sc.close();

	}


}
