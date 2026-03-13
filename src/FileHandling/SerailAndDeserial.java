package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	public int empid;
	public String empName;
	
	public Employee(int id, String name) {
		this.empid = id;
		this.empName = name;
	}
}

public class SerailAndDeserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee object = new Employee(1,"ram");
		String fileName ="file.ser";
		
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		
		catch(IOException e) {
			System.out.println("IOException is caught");
		}
		
		Employee object1 = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			object1 = (Employee)in.readObject();
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized");
			System.out.println("Employee Id = " + object1.empid + "\nEmployee Name = " + object1.empName);
		}
		catch(IOException ex) {
			System.out.println("IOEXception is caught");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
		
	}

}
