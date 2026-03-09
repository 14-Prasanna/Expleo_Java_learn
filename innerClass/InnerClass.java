/**
 * 
 */
package innerClass;

/**
 * 
 */

class OuterClass{
	int age = 18;
	public void checkage() {
		System.out.println("The outer class");
	}
	class InnerClass{
		public void print() {
			System.out.println("wow.... we achived the inner class creation");
		}
	}
}


public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass out = new OuterClass();
		out.checkage();
		OuterClass.InnerClass in = out.new InnerClass();
		in.print();

	}

}
