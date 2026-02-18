/**
 * 
 */
package Class_learn;

class Employee1{
	
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


public class ArrayObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 emp[] = new Employee1[2];
		
		for(int i=0;i<2;i++) {
			emp[i] = new Employee1();
		}
		
		emp[0].setEmployeeDetails(101, "Prasanna");
		emp[1].setEmployeeDetails(102, "Deepak");
		
		for(int i=0;i<2;i++) {
			emp[i].getEmployeeDetails();
			System.out.println();
		}

	}

}
