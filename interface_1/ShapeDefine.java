/**
 * 
 */
package interface_1;

interface Shape{
	double DEFAULT_VALUE = 1.0;
	double calArea();
	double calPerimeter();
	default String getDescription() {
		return "The shape is undefined";
	}
}

abstract class Circle implements Shape{
	private double radius;
	
	public Circle(double r) {
	radius = r;
	}
	
	public Circle() {
		radius = DEFAULT_VALUE;
	}
	
	public double calPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public String getDescription() {
		return "A cricle with radius " + radius;
	}
}

class Rect implements Shape{
	
	int l1, b1 = 0;
	
	Rect(int l, int b){
		l1 = l;
		b1 = b;
	}
	
	public double calArea() {
		return l1 * b1;
	}
	
	public double calPerimeter() {
		return  2 * (l1+b1);
	}
	
//	public String getDescription() {
//		return "A rectangle";
//	}
	
}

/**
 * 
 */
public class ShapeDefine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rect s1= new Rect(5,9);
		double a = s1.calArea();
		double b = s1.calPerimeter();
		String c = s1.getDescription();
		
		System.out.print(a + "\t" + b +"\t" + c);
		
		
		

	}

}
