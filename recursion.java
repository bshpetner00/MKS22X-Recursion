import java.util.*;
public class recursion {

	public static double sqrtHelp(double n, double g, double p)	 {
		if (closeEnough(g,Math.pow(n,0.5))) return g;
    return sqrtHelp(n, (n / g + g), p);
	}
	public static double sqrt(double n, double p) {
		return sqrtHelp(n, 1, p);	
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
	}	
}

