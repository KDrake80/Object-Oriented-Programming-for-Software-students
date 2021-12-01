/*
 * Author Kevin Drake
 * Date 11/30/21
 * This Class creates a MyInteger Object
 */
public class MyInteger {
	int value;
	public MyInteger(int value) {
		this.value = value;
	}
	public int getMyInteger() {
		return value;
	}
	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		return false;
	}
	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		return false;
	}
	public boolean isPrime() {
		if (isPrime(value))
			return true;
		return false;
	}
	public static boolean isEven(int value) {
		boolean even = false;
		if (value % 2 == 0)
			even = true;
		return even;
	}
	public static boolean isOdd(int value) {
		boolean odd = false;
		if (value % 2 != 0)
			odd = true;
		return odd;
	}
	public static boolean isPrime(int value) {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInteger) {
		if (myInteger.value % 2 == 0)
			return true;
		return false;
	}
	public static boolean isOdd(MyInteger myInteger) {
		if (isOdd(myInteger.value))
			return true;
		return false;
	}
	public static boolean isPrime(MyInteger myInteger) {
		if (isPrime(myInteger.value))
			return true;
		return false;
	}
	public boolean equals(int value) {
		if (getMyInteger() == value) 
				return true;
		return false;
	}
	public boolean equals(MyInteger myInteger) {
		if (myInteger.value == getMyInteger())
			return true;
		return false;
	}
	public static int parseInt(char[] chars) {
		String s = String.valueOf(chars);
		int x = Integer.parseInt(s);
		return x;
	}
	public static int parseInt(String string) {
		int x = Integer.parseInt(string);
		return x;
	}
}
