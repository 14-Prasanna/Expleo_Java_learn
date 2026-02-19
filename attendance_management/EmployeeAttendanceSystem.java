/**
 * 
 */
package attendance_management;


import java.time.LocalTime;
import java.util.*;

class Attendance {

    private int empId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private boolean isCheckedIn = false;
    private boolean isCheckedOut = false;

    Attendance(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public boolean getCheckInStatus() {
        return isCheckedIn;
    }

    public boolean getCheckOutStatus() {
        return isCheckedOut;
    }

    public void markCheckIn() {

        if (isCheckedIn) {
            System.out.println("Employee already checked in today.");
            return;
        }

        checkInTime = LocalTime.now();
        isCheckedIn = true;
        System.out.println("Check-in successful at: " + checkInTime);
    }
    
    public void markCheckOut() {

        if (!isCheckedIn) {
            System.out.println("Check-in required before check-out.");
            return;
        }

        if (isCheckedOut) {
            System.out.println("Employee already checked out today.");
            return;
        }

        checkOutTime = LocalTime.now();
        isCheckedOut = true;
        System.out.println("Check-out successful at: " + checkOutTime);
    }
    
    public String getAttendanceDetails() {

        return "\nEmployee ID: " + empId +
               "\nCheck-in Time: " + (checkInTime != null ? checkInTime : "Not Checked In") +
               "\nCheck-out Time: " + (checkOutTime != null ? checkOutTime : "Not Checked Out") +
               "\nChecked In: " + isCheckedIn +
               "\nChecked Out: " + isCheckedOut;
    }
    
}

class Employee {

    private int empId;
    private String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void markCheckIn(Attendance attendance) {

        if (attendance.getEmpId() == this.empId) {
            attendance.markCheckIn();
        }
        else {
            System.out.println("Invalid attendance mapping.");
        }
    }
    
    public void markCheckOut(Attendance attendance) {

        if (attendance.getEmpId() == this.empId) {
            attendance.markCheckOut();
        }
        else {
            System.out.println("Invalid attendance mapping.");
        }
    }
    
    
}

public class EmployeeAttendanceSystem {
	
	static int counter = 1;

    static int generateEmpId() {
        return counter++;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        ArrayList<Employee> empList = new ArrayList<>();
        ArrayList<Attendance> attList = new ArrayList<>();

        System.out.println("=====PRASANNA COMPNAY ----- Employee Attendance Management System =====");

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. Check-In");
            System.out.println("3. Check-Out");
            System.out.println("4. View Attendance");
            System.out.println("0. Exit");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            
            if (choice == 0) {
                System.out.println("System Closed Successfully.");
                break;
            }
            
            
            switch (choice) {

            case 1:
                System.out.println("Enter Employee Name:");
                sc.nextLine();
                String name = sc.nextLine();

                int id = generateEmpId();

                Employee e1 = new Employee(id, name);
                Attendance a1 = new Attendance(id);

                empList.add(e1);
                attList.add(a1);

                System.out.println("Employee Created Successfully");
                System.out.println("Employee ID: " + id);
                break;
                
            case 2:
                System.out.println("Enter Employee ID:");
                int checkInId = sc.nextInt();

                Attendance foundAttIn = null;
                Employee foundEmpIn = null;

                for (Employee e : empList) {
                    if (e.getEmpId() == checkInId) {
                        foundEmpIn = e;
                    }
                }

                for (Attendance a : attList) {
                    if (a.getEmpId() == checkInId) {
                        foundAttIn = a;
                    }
                }

                if (foundEmpIn != null && foundAttIn != null) {
                    foundEmpIn.markCheckIn(foundAttIn);
                }
                else {
                    System.out.println("Employee not found.");
                }

                break;
                
            case 3:
                System.out.println("Enter Employee ID:");
                int checkOutId = sc.nextInt();

                Attendance foundAttOut = null;
                Employee foundEmpOut = null;

                for (Employee e : empList) {
                    if (e.getEmpId() == checkOutId) {
                        foundEmpOut = e;
                    }
                }

                for (Attendance a : attList) {
                    if (a.getEmpId() == checkOutId) {
                        foundAttOut = a;
                    }
                }

                if (foundEmpOut != null && foundAttOut != null) {
                    foundEmpOut.markCheckOut(foundAttOut);
                }
                else {
                    System.out.println("Employee not found.");
                }

                break;
                
            case 4:
                System.out.println("Enter Employee ID:");
                int viewId = sc.nextInt();

                for (Attendance a : attList) {
                    if (a.getEmpId() == viewId) {
                        System.out.println(a.getAttendanceDetails());
                    }
                }

                break;

            default:
                System.out.println("Invalid Option.");
                
                
            }
        }
        
        sc.close();
	}

}
