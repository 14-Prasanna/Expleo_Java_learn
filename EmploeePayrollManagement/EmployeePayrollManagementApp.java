package EmploeePayrollManagement;

import java.util.Scanner;

abstract class Employee {
    String empId;
    String empName;
    double empSalary;

    public Employee(String empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    
    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
      
    }

    public double calculateSalary() {
        return empSalary;
    }

    public void display() {
        System.out.println("\n-----------------------------------");
        System.out.println("        EMPLOYEE DETAILS");
        System.out.println("-----------------------------------");
        System.out.println("Employee ID     : " + empId);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Final Salary    : " + calculateSalary());
        System.out.println("-----------------------------------\n");
    }
}

// Permanent Employee
class PermanentEmployee extends Employee {
    double empBonus;

    public PermanentEmployee(String empId, String empName, double empSalary, double empBonus) {
        super(empId, empName, empSalary);
        this.empBonus = empBonus;
    }

    public double calculateSalary() {
        return empSalary + empBonus;
    }
}

// Contract Employee
class ContractEmployee extends Employee {
    double taxRate;
    double serviceCharge;

    public ContractEmployee(String empId, String empName, double empSalary,double taxRate, double serviceCharge) {
        super(empId, empName, empSalary);
        this.taxRate = taxRate;
        this.serviceCharge = serviceCharge;
    }

    public double calculateSalary() {
        return (empSalary - ((empSalary * taxRate) - serviceCharge));
    }
}

// Intern
class Intern extends Employee {
    double stipend;

    public Intern(String empId, String empName, double stipend) {
    	super(empId, empName, stipend);
        this.stipend = stipend;
    }

    public double calculateSalary() {
        return stipend;
    }
}

// Main Class
public class EmployeePayrollManagementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== EMPLOYEE PAYROLL MANAGEMENT =====");
            System.out.println("1. Permanent Employee");
            System.out.println("2. Contract Employee");
            System.out.println("3. Intern");
            System.out.println("4. Exit");
            System.out.print("Choose Employee Type: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 4) {
                System.out.println("\nExiting Application... Thank You!");
                break;
            }

            Employee emp = null;

            switch (choice) {

                case 1:
                	System.out.print("\nEnter Employee ID   : ");
                    String id = sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Base Salary   : ");
                    double salary = sc.nextDouble();

                    System.out.print("Enter Bonus         : ");
                    double bonus = sc.nextDouble();
                    emp = new PermanentEmployee(id, name, salary, bonus);
                    break;

                case 2:
                	System.out.print("\nEnter Employee ID   : ");
                    String id1 = sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name1 = sc.nextLine();

                    System.out.print("Enter Base Salary   : ");
                    double salary1 = sc.nextDouble();

                    System.out.print("Enter Tax Rate (0.1 for 10%) : ");
                    double tax = sc.nextDouble();

                    System.out.print("Enter Service Charge         : ");
                    double service = sc.nextDouble();

                    emp = new ContractEmployee(id1, name1, salary1, tax, service);
                    break;

                case 3:
                	System.out.print("\nEnter Employee ID   : ");
                    String id11 = sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name11 = sc.nextLine();


                    System.out.print("Enter Stipend       : ");
                    double stipend = sc.nextDouble();
                    emp = new Intern(id11, name11, stipend);
                    break;

                default:
                    System.out.println("\nInvalid Choice!\n");
                    continue;
            }

            emp.display();

        } while (choice != 4);

        sc.close();
    }
}