package convertions;
abstract class Shape{
	abstract double getArea();
	
	abstract double getPerimeter();
} // Shape class close

class Circle extends Shape{

	final static double pi = 3.14;
	float radius;
	
	Circle(){
		radius = 0;
	} // Circle() closing
	
	
	public Circle(float radius) {
		this.radius = radius;
	} // Circle mehod closing


	double getArea() {
		return pi * (radius * radius);
	} // getArea method closing

	double getPerimeter() {
		return 2 * (pi * radius);
	}
} // Circle class closing

class Square extends Shape{

	float side;
	
	
	public Square(float side) {
		this.side = side;
	} //

	double getArea() {
		return side * side;
	}

	double getPerimeter() {
		return 4 * side;
	}
	
} // Square class closing
public class Shape_Program {

	public static void main(String[] args) {
		Shape s = new Circle(3);
		System.out.println("Area of circle = " + s.getArea());
		System.out.println("Perimeter of circle = " + s.getPerimeter());
		Shape s2 = new Square(4);
		System.out.println("Area of square = " + s2.getArea());
		System.out.println("Perimeter of square = " + s2.getPerimeter());
		
	} // main method closing
} // class closing
