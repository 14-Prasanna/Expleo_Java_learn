package com.dbMysql;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Get Employees by Dept");
            System.out.println("4. Get One Employee Name by Dept");
            System.out.println("5. Delete the employee based on ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Dept: ");
                    String dept = sc.nextLine();

                    dao.insertEmp(new Employee(id, name, dept));
                    break;

                case 2:
                    dao.display();
                    break;

                case 3:
                    System.out.print("Enter Dept: ");
                    String deptFilter = sc.nextLine();

                    dao.getEmployeesByDept(deptFilter);
                    break;

                case 4:
                    System.out.print("Enter Dept: ");
                    String deptSingle = sc.nextLine();

                    dao.getOneEmployeeNameByDept(deptSingle);
                    break;
                    
                case 5:
                	System.out.println("Enter the employee id:");
                	int id1 = sc.nextInt();
                	
                	dao.deleteEmployeeById(id1);
                	break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}