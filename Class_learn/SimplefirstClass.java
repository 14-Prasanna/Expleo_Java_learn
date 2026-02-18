/**
 * 
 */
package Class_learn;

/**
 * 
 */

class Theatre{
	int theatreid = 101;
	String theatername = "RAJAN THEATRE";
	String location = "KAKAPALAIYAM";
	
	public void displayTheatre(){
		System.out.println("Theatre ID: " + theatreid);
		System.out.println("The name of Theatre " + theatername);
		System.out.println("The location of Theatre " + location);
	}
}
public class SimplefirstClass extends Theatre {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Theatre ob = new Theatre();
		ob.displayTheatre();
		
		System.out.println("");
		Theatre ob1;
		ob1 = new Theatre();
		ob1.displayTheatre();

	}

}
