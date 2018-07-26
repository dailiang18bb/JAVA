public class RecursionGOODLUCK{



	// n + (n-1) + (n-2) + (n-3) + ...... + 2 + 1 + 0
	// 5 + 4 + 3 + 2 + 1 + 0 = 15
	public static int Summation(int n) {
		return (n > 0) ? n + Summation(n - 1) : 0;
	}

	// 5! = 5 * 4 * 3 * 2 * 1
	public static int Factorial(int n) {
		return (n > 1) ? n * Factorial(n - 1) : 1;
	}

	// 5^3 = 5 * 5 * 5
	// 5 * E(5 ,2 )
	// 5 * 5 * E(5,1)
	// 5 * 5 * 5 * E(5,0)
	public static int Exponentiation(int n, int p) {
		return (p > 0) ? n * Exponentiation(n, p - 1) : 1;
	}

	public static void main(String[] args) {
		
		System.out.println(Summation(10));
		System.out.println(Factorial(10));
		System.out.println(Exponentiation(5,3));
	}
}