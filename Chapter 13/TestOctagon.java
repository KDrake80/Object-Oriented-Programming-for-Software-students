/*
 * Author Kevin Drake
 * Date 12/9/21
 * This program tests the Subclass Octagon for the Superclass GeometricObject
 * and implements the Comparable and Clonable Interfaces.
 */
public class TestOctagon {
	public static void main(String[] args) {
		Octagon o1 = new Octagon(5, "Green", true);
		Octagon o2 = (Octagon)o1.clone();
		System.out.println(o1.compareTo(o2));
		if (o1.compareTo(o2) == 0)
			System.out.println("o1.compareTo(o2) is " + true);
	}
}
