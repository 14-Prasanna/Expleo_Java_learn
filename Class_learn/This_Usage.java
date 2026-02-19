/**
 * 
 */
package Class_learn;

class Employee10{
	int empid;
	String empName;
	double empsalary;
	
	Employee10(int empid, String empName, int empsalary){
		this.empid = empid;
		this.empName = empName;
		this.empsalary = empsalary;
		
		System.out.println("Employee record created successfully!\n");
	}
	
	Employee10(){
		this(101,"Default employee",30000);
		System.out.println("Default Constructor called - initialized with default data. \n");
	}
	
	void registerEmployee() {
		System.out.println("Register Employee....");
		System.out.println();
		this.displayDetails();
	}
	
	void displayDetails() {
		System.out.println("Employee ID:" + empid);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Salary:" + empsalary);
		System.out.println("");
	}
	
	void sendForProcessing() {
		HRDepartment hr =  new HRDepartment();
		hr.processEmployee(this);
	}
	
	
	Employee10 updateSalary(double hike) {
		this.empsalary = empsalary + (empsalary * hike / 100);
		return this;
	}
	
	Employee10 updateName(String newName) {
		this.empName = newName;
		return this;
	}
}

class HRDepartment{
	void processEmployee(Employee10 e) {
		System.out.println("HR Department Processing Employee...");
		System.out.println("Processed Employee: " + e.empName + " with salary " + e.empsalary + "\n");
	}
}
public class This_Usage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee10 e = new Employee10(102, "PRASANNA",60000);
		e.registerEmployee();
		
		e.sendForProcessing();
		
		System.out.println(" --- Updating Employee Details -- ");
		e.updateName("Deepak").updateSalary(70000).displayDetails();
		e.sendForProcessing();
		

	}

}
