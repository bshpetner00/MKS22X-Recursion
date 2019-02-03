import java.util.*;
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
	public static int f(int n, int sum, int prev, int old) {
		if (n <= 0) {
			return sum;
		}
		else {
			return f(n-1, prev+old,prev+old,prev);
		}
	}
	public static int fib(int n) {
		return f(n, 0, 0, 1);
	}
	public static ArrayList<Integer> makeAllSums(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		m(n,0,list);
		return list;
	}
	private static void m(int n, int sum, ArrayList<Integer> list) {
		if (n >= 1) {
			m(n-1,sum+n, list);
			m(n-1,sum, list);
		}
		else {
			list.add(sum);
		}
	}
	public static void main(String[] args) {
		System.out.println("Squirt " + sqrt(64));
		System.out.println("Lie " + fib(0));
		System.out.println("Lie " + fib(1));
		System.out.println("Lie " + fib(2));
		System.out.println("Lie " + fib(5));
		System.out.println("Sun " + makeAllSums(3));
    	System.out.println("Sun " + makeAllSums(2));
	}	
}

