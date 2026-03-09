/**
 * 
 */
package abstraction;

abstract class Shape{
	void draw() {
		System.out.println("Drawing");
	}
	abstract void area();
	abstract void perimeter();
}

class Rectangle extends Shape{
	
	int l1 , b1 = 0;
	
	Rectangle(int l, int b){
		l1 = l;
		b1 = b;
	}
	
	void area() {
		System.out.println("The area of Rectangle is ( L * B ) = " + (l1 * b1));
	}
	void perimeter() {
		System.out.println("The perimeter of Rectangle is ( 2 * (l + b) )" + (2*(l1+b1)));
	}
}

class Circle extends Shape{
	
	int l1 , b1 = 0;
	
	double pi = 3.14;
	
	Circle(int l){
		l1 = l;
	}
	
	void area() {
		System.out.println("The area of Circle is " +  (pi * 1 * 11));
	}
	void perimeter() {
		System.out.println("The perimeter of Circle is " + pi * l1);
	}
}


class Square extends Shape{
	
	int l1 , b1 = 0;
	
	
	Square(int l ){
		l1 = l;

	}
	
	void area() {
		System.out.println("The area of Square is " +   l1 * l1);
	}
	void perimeter() {
		System.out.println("The perimeter of Square is " + (l1 + l1+ l1+ l1));
	}
}



public class AllShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		s = new Rectangle(2, 5);
		s.draw();
		s.area();
		s.perimeter();
		
		
		s = new Circle(5);
		s.area();
		s.perimeter();
		
		s = new Square(5);
		s.area();
		s.perimeter();
		

	}

}
