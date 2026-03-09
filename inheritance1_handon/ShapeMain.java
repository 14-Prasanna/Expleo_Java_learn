package inheritance1_handon;

import java.util.Scanner;

interface Shape111 {
    // Interfaces define behaviors
    double getArea();
    double getPerimeter();
    String getColor();
    void setColor(String color);
    boolean isFilled();
    void setFilled(boolean filled);
    String toString();
}


class Circle111 implements Shape111 {
    protected double radius = 1.0; // Default value 1.0 as requested
    protected String color = "red";
    protected boolean filled = true;

    public Circle111() {}

    public Circle111(double radius) {
        this.radius = radius;
    }

    public Circle111(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public String getColor() { return color; }
    @Override
    public void setColor(String color) { this.color = color; }
    @Override
    public boolean isFilled() { return filled; }
    @Override
    public void setFilled(boolean filled) { this.filled = filled; }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color=" + color + ",filled=" + filled + "],radius=" + radius + "]";
    }
}




class Rectangleess1 implements Shape111 {
    protected double width = 1.0;
    protected double length = 1.0;
    protected String color = "red";
    protected boolean filled = true;

    public Rectangleess1() {}

    public Rectangleess1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangleess1(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    
    public double getWidth() 
    {
    	return width; 
    }
    public void setWidth(double width) 
    { 
    	this.width = width; 
    }
    public double getLength() 
    {
    	return length; 
    }
    public void setLength(double length) 
    {
    	this.length = length; 
    }

    @Override
    public String getColor() 
    {
    	return color; 
    }
    @Override
    public void setColor(String color)
    {
    	this.color = color; 
    }
    @Override
    public boolean isFilled() 
    {
    	return filled; 
    }
    @Override
    public void setFilled(boolean filled) 
    {
    	this.filled = filled; 
    }

    @Override
    public double getArea() 
    {
    	return width * length; 
    }
    @Override
    public double getPerimeter() 
    {
    	return 2 * (width + length); 
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color=" + color + ",filled=" + filled + "],width=" + width + ",length=" + length + "]";
    }
}


class Square11 extends Rectangleess1 {
    public Square11() {}

    public Square11(double side) {
        super(side, side);
    }

    public Square11(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { 
    	return getWidth(); 
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) 
    {
    	setSide(side); 
    }
    @Override
    public void setLength(double side) 
    {
    	setSide(side); 
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}



public class ShapeMain {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- Shape Management System ---");
            System.out.println("1. Create Circle");
            System.out.println("2. Create Rectangle");
            System.out.println("3. Create Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = scanner.nextDouble();
                    Circle111 c = new Circle111(r, "red", true);
                    System.out.println(c.toString());
                    System.out.println("Area: " + c.getArea());
                    break;

                case 2:
                    System.out.print("Enter width: ");
                    double w = scanner.nextDouble();
                    System.out.print("Enter length: ");
                    double l = scanner.nextDouble();
                    Rectangleess1 rect = new Rectangleess1(w, l, "blue", true);
                    System.out.println(rect.toString());
                    System.out.println("Area: " + rect.getArea());
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = scanner.nextDouble();
                    Square11 sq = new Square11(s, "green", true);
                    System.out.println(sq.toString());
                    System.out.println("Area: " + sq.getArea());
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println(); 
        } while (choice != 4);

        scanner.close();
        }
}
