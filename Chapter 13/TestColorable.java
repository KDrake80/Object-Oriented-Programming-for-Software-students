/*
 * Author Kevin Drake
 * Date 12/9/21
 * This is the test class to test the Colorable Interface between Triangle and GeoObj
 */
public class TestColorable {
	public static void main(String[] args) {
		GeometricObject[] objects = new GeometricObject[5];
		objects[0] = new Triangle(1, 2, 3, "Yellow", false);
		objects[1] = new Triangle(4, 5, 6, "Green", true);
		objects[2] = new Triangle(1.1, 2.2, 3.3, "Blue", false);
		objects[3] = new Triangle(4.4, 5.5, 6.6, "Black", true);
		objects[4] = new Triangle(1, 1, 1, "Red", true);
		
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Colorable) {
				System.out.println("Area is: " + objects[i].getArea());
				((Triangle)objects[i]).howToColor();
			}
		}
	}
}
