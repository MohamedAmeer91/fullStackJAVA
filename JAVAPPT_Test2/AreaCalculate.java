abstract class Shape{
	 
	abstract double calculateArea();
}

class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	double calculateArea() {		
		return length * width;
	}
	
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {		
		return 3.14 * radius * radius;
	}
	
}

class Triangle extends Shape{
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	double calculateArea() {
		
		return 0.5*base*height;
	}
	
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}

public class AreaCalculate {

	public static void main(String[] args) {
		ShapeCalculator calc = new ShapeCalculator();
		
		Rectangle rect = new Rectangle(5, 6);
		calc.printArea(rect);
		
		Circle circ = new Circle(5);
		calc.printArea(circ);
		
		Triangle tri = new Triangle(5, 6);
		calc.printArea(tri);

	}

}
