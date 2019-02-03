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

	public static void main(String[] args) {
		System.out.println("" + sqrt(64));
	}	
}

