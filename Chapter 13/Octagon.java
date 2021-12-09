/*
 * Author Kevin Drake
 * Date 12/9/21
 * This Class defines an Octagonal object 
 */
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	private double side = 1;
	
	public Octagon() {
		super();
	}
	public Octagon(double side) {
		super();
		this.side = side;
	}
	public Octagon(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double getArea() {
		double area = ((4 / (Math.sqrt(2))) + 2) * side * side;
		return area;
	}
	@Override
	public double getPerimeter() {
		return (8 * side);
	}
	@Override
	public String toString() {
		return super.toString() + "\n Area: " + getArea() + "\n Perimeter: " + getPerimeter();
	}
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	@Override
	public Object clone() {
		return new Octagon(getSide(), getColor(), isFilled());
	}
}
