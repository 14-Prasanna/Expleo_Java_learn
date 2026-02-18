/**
 * 
 */
package Class_learn;

class Employee7{
	
	int empid ;
	String name;
	
	Employee7(){
		
	}
	
	public Employee7(int n, String name1) {
		empid = n;
		name = name1;
	}
	
	public void getEmployeeDetails() {
		System.out.println("The employee ID: " + empid);
		System.out.println("The employee Name: " + name);
	}
}


public class ParameterConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee7 emp2 = new Employee7();
		Employee7 emp = new Employee7(101, "Prasanna");
		Employee7 emp1 = new Employee7(102, "Deepak");
		
		emp.getEmployeeDetails();
		System.out.println("");
		
		emp.finalize();
		System.gc();
		
		emp1.getEmployeeDetails();
		System.out.println("");
		
		emp2.getEmployeeDetails();

	}
	@Override
	public void finalize() {
		System.out.println("The object 1 is cleared");
	}

}
