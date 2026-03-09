/**
 * 
 */
package innerClass;

/**
 * 
 */

class Person{
	int age = 21, w = 51;
	class Gender{
		void nonStaticDisplay() {
			System.out.println("In Non static display method");
			System.out.println("Age is : " + age);
		}
		
		void staticDisplay() {
			System.out.println("In static Display Method");
			System.out.println("Weight value : "  + w);
		}
		
	}
	Gender gen = new Gender();
}
public class StaticOuterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.gen.nonStaticDisplay();
		person.gen.staticDisplay();

	}

}
