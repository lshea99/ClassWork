/**
 * COSC 310-002 Assignment 6
 * Prog6.java
 * 
 * This class uses a recursive method to return the value of a
 * user given base to the n power
 * 
 * 
 * @author Lane Shea
 */
import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		int base = 0;
		int n = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter base value: ");
		base = in.nextInt();
		System.out.println("Enter n value: ");
		n = in.nextInt();
		
		System.out.println("Base Value: " + base);
		System.out.println("N value: " + n);
		
		System.out.println("Result: "+Power(base,n));
		
		}
	public static int Power(int base, int n) {
		int result = 0;
		if ( n == 0 ) {
			return 1;
		}
		else {
			result = base * (int)Math.pow(base, n-1);
			return result;
		}
	}
	}


