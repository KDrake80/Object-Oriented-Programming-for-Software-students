/*
 * Author Kevin Drake
 * Date 12/9/21
 * This is the test program to test the Abstract GeoObject superclass, and Triangle subclass
 */
import java.util.*;
public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Select a color: ");
		String c = input.nextLine();
		System.out.println("Press 1 for filled 0 for not filled: ");
		int x = input.nextInt();
		boolean f = false;
		if (x == 1)
			f = true;
		
		System.out.println("Enter 3 sides of a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		GeometricObject t = new Triangle(s1, s2, s3, c, f);
		System.out.println(t.toString());
	}
}
