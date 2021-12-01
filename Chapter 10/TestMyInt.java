/*
 * Author Kevin Drake
 * Date 11/30/21
 * This Class tests the MyInteger Object, and all the methods it contains.
 */
public class TestMyInt {
	public static void main(String[] args) {
		// Creates Three "Test" MyInteger Objects
		MyInteger one = new MyInteger(5);
		MyInteger two = new MyInteger(36);
		MyInteger three = new MyInteger(97);
		System.out.println("This tests the non-static isEven Method");
		System.out.println(one.isEven());
		System.out.println(two.isEven());
		System.out.println(three.isEven() + "\n");
		
		System.out.println("This tests the non-static isOdd Method");
		System.out.println(one.isOdd());
		System.out.println(two.isOdd() + "\n");
		
		System.out.println("This tests the non-static isPrime Method");
		System.out.println(one.isPrime());
		System.out.println(two.isPrime());
		System.out.println(three.isPrime() + "\n");
		
		System.out.println("This tests the static isEven(int) Method");
		System.out.println(MyInteger.isEven(1));
		System.out.println(MyInteger.isEven(2));
		System.out.println(MyInteger.isEven(3) + "\n");
		
		System.out.println("This tests the static isOdd(int) Method");
		System.out.println(MyInteger.isOdd(1));
		System.out.println(MyInteger.isOdd(2));
		System.out.println(MyInteger.isOdd(3) + "\n");
		
		System.out.println("This tests the static isPrime(int) Method");
		System.out.println(MyInteger.isPrime(101));
		System.out.println(MyInteger.isPrime(100));
		System.out.println(MyInteger.isPrime(271) + "\n");
		
		System.out.println("This tests the static isEven(MyInteger) Method");
		System.out.println(MyInteger.isEven(one));
		System.out.println(MyInteger.isEven(two));
		System.out.println(MyInteger.isEven(three) + "\n");
		
		System.out.println("This tests the static isOdd(MyInteger) Method");
		System.out.println(MyInteger.isOdd(one));
		System.out.println(MyInteger.isOdd(two));
		System.out.println(MyInteger.isOdd(three) + "\n");
		
		System.out.println("This tests the static isPrime(MyInteger) Method");
		System.out.println(MyInteger.isPrime(one));
		System.out.println(MyInteger.isPrime(two));
		System.out.println(MyInteger.isPrime(three) + "\n");
		
		System.out.println("This test the non-static equals(int) method");
		System.out.println(one.equals(5));
		System.out.println(one.equals(6));
		System.out.println(two.equals(36));
		System.out.println(three.equals(101) + "\n");
	
		System.out.println("This tests the non-static equals(MyInteger)");
		System.out.println(one.equals(one));
		System.out.println(two.equals(three) + "\n");
		
		System.out.println("This test the static parseInt(char[]) method");
		char[] chars = {'1', '2', '3'};
		char[] srahc = {'3', '2', '1'};
		System.out.println(MyInteger.parseInt(chars));
		System.out.println(MyInteger.parseInt(srahc) + "\n");
		
		System.out.println("This tests the static parseInt(String) method");
		System.out.println(MyInteger.parseInt("1234"));
		System.out.println(MyInteger.parseInt("4321"));
	}

}
