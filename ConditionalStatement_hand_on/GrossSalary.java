package ConditionalStatement_hand_on;

import java.util.*;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = 0;
        double da = 0;

        if(basicSalary <= 10000){
            hra = basicSalary * 0.20;
            da = basicSalary * 0.80;
        }
        else if(basicSalary <= 20000){
            hra = basicSalary * 0.25;
            da = basicSalary * 0.90;
        }
        else{
            hra = basicSalary * 0.30;
            da = basicSalary * 0.95;
        }

        double grossSalary = basicSalary + hra + da;

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);

	}

}
