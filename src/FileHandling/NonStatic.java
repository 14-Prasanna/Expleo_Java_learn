package FileHandling;

import java.io.*;

class Employee1 implements Serializable {

    private static final long serialVersionUID = 129348938L;

    transient int empid;
    static int deptId;
    String empName;
    int empAge;

    public Employee1(String name, int age, int id, int deptid) {
        empName = name;
        empAge = age;
        empid = id;
        deptId = deptid;
    }

    public void printdata(Employee1 object) {
        System.out.println("EmpName: " + object.empName);
        System.out.println("EmpAge: " + object.empAge);
        System.out.println("EmpId: " + object.empid);
        System.out.println("Department Id: " + object.deptId);
    }
}

public class NonStatic {

    public static void main(String[] args) {

        Employee1 object = new Employee1("Ram", 29, 2, 1000);
        String filename = "Ram.txt";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
            System.out.println("Data before Deserialization");

            object.printdata(object);

            // object.deptId = 2000;
            object.empAge = 100;

        } 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        object = null;

        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object = (Employee1) in.readObject();

            in.close();
            file.close();

            System.out.println("\nObject has been deserialized");
            System.out.println("Data after Deserialization");

            object.printdata(object);

        } 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}