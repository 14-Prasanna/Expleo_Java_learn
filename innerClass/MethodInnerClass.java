/**
 * 
 */
package innerClass;

/**
 * 
 */

class Outer{
	int val = 56;
	public void outerClassMethod() {
		System.out.println("Inside the method of Outeclass ");
		
		class Inner{
			public void innerClassMethod(){
				System.out.println("Nice..... working printing the varaible used in the outerclass " + val);
			}
		}
		Inner in = new Inner();
		in.innerClassMethod();
	}
}
public class MethodInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer out = new Outer();
		out.outerClassMethod();

	}

}
