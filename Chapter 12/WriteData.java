/*
 * Author Kevin Drake
 * Date 12/7/21
 * This Program creates a file and populates it with 100 random integers.
 * It then reads the file and displays the contents
 */
import java.io.PrintWriter;
import java.util.*;
public class WriteData {
	public static void main(String[] args) throws java.io.IOException {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if (file.exists()) 
			System.exit(1);
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		for (int i = 0; i < 100; i++) {
			output.print((int)(Math.random() * 100) + " ");
		}
		output.close();
		
		Scanner input = new Scanner(file);
		int[] x = new int[100];
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
		System.out.print(x[i] + " ");
		}
	}
}
