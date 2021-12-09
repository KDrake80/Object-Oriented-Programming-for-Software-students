/*
 * Author Kevin Drake
 * Date 12/9/21
 * This class is a subclass of the Abstract GeometricObject superclass
 */
public class Triangle extends GeometricObject implements Colorable {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public Triangle() {
		super();
	}
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(double side1, double side2, double side3,
				String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Area: " + getArea() + "\n Perimeter: " + getPerimeter();
	}
	@Override
	public void howToColor() {
		 System.out.println("Triangle: Color All three Sides");
	}
}
