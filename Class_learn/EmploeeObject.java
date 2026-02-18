/**
 * 
 */
package Class_learn;

class Employee{
	
	int empid ;
	String name;
	
	public void setEmployeeDetails(int n, String name1) {
		this.empid = n;
		this.name = name1;
	}
	
	public void getEmployeeDetails() {
		System.out.println("The employee ID: " + empid);
		System.out.println("The employee Name: " + name);
	}
}

public class EmploeeObject {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp.setEmployeeDetails(101, "Prasanna");
		emp1.setEmployeeDetails(102, "Deepak");
		emp.getEmployeeDetails();
		System.out.println("");
		emp1.getEmployeeDetails();

	}

}
