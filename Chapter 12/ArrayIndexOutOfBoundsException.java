/*
 * Author Kevin Drake
 * Date 12/6/21
 * This Program writes a custom exception for an Array out of bounds exception
 */
import java.util.*;
public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		System.out.println("Enter an index: ");
		int x = input.nextInt();
		System.out.println(array[x]);
	}
		catch (Exception ex){
			System.out.println("Out of Bounds");
		}
	}
}
