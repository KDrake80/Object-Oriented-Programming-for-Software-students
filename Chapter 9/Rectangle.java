/*
 *Author Kevin Drake 
 *Date 11/23/21
 *This Program Creates an Rectangle Object Class, Then Creates Two Rectangles with different sizes, and displays information on each
 */
public class Rectangle {
	double width = 1;
	double height = 1;
	Rectangle() {	
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.println("The Width of r1 is " + r1.width + " and Height is " + r1.height);
		System.out.println("The Area of r1 is " + r1.getArea() + " and the Perimeter is " + r1.getPerimeter());
		System.out.println("The Width of r2 is " + r2.width + " and Height is " + r2.height);
		System.out.println("The Area of r2 is " + r2.getArea() + " and the Perimeter is " + r2.getPerimeter());
	}

}
