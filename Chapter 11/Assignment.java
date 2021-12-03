/*
 * Author Kevin Drake
 * Date 12/2/21
 * This program tests the Triangle and GeometricObject classes
 */
import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 sides of a triangle with a space between them: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		Triangle t = new Triangle(s1, s2, s3);
		System.out.println("Pick any color for the Triangle: ");
		String color = input.next();
				t.setColor(color);			
		System.out.println("Press 1 for filled or 2 for empty: ");
		int i = input.nextInt();
		boolean f = false;
		if (i == 1)
			f = true;
		t.setFilled(f);	
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
		System.out.println(t.getColor());
		System.out.println(t.getDateCreated());
		System.out.println(t.isFilled());
	}
}
