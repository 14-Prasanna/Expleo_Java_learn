/**
 * 
 */
package interface_1;

/**
 * 
 */


class Base
{
	int i;
	void display() 
	{
		System.out.println(i);
	}
}


class Derived extends Base{
		int j;
		void display() 
		{
			System.out.println(j);
		}
} 


public class inheritance_demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived obj = new Derived();
		obj.i=5;
		obj.j=10;
		obj.display();

	}

}
