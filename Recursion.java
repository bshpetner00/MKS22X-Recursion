import java.io.*;
public class Recursion {
	public static double sqrtHelp(double n, double g)	 {
		if (Math.abs((g*g - n)/n) <= .0001) {
			return g;
		}
		else {
			g = (n / g + g) / 2;
			return sqrtHelp(n,g);
		}
	}
	public static double sqrt(double n) {
		return sqrtHelp(n, 1);	
	}
	public static int f(int n, int sum, int two, int one) {
		if (n == 0) {
			return sum;
		}
		else {
			return f(n-1,two+one, one, two+one);
		}
	}
	public static int fib(int n) {
		return f(n,0,0,1);
	}
	public static void main(String[] args) {
		System.out.println("" + sqrt(64));
		System.out.println("" + fib(0));
		System.out.println("" + fib(1));
		System.out.println("" + fib(5));
	}	
}

