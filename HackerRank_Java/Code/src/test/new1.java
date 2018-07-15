
/**
 *  JAVA
 * @author charles
 *
 */



class Liang {
	
	

	// 1,000,000,000
	public static String numberCommas(int n) {
		String s = String.format("%, d", n);
		System.out.println(s);
		return s;
	}
	
	

	/**
	 * checkPowerOf2 method is to check whether the number n is the power of 2.
	 * 
	 * @param n,  a positive number
	 * @return true, if n is the power of 2
	 * @return false, if n less or equal to 0, or not the power of 2
	 * 
	 * July, 15th, 2018
	 */

	// 2^0 = 1
	// 2^1 = 2
	// 2^8 = 256
	// 2^10 = 1024

	public static boolean checkPowerOf2(int n) {
		if (n <= 0) {
			return false;
		}

		if ((n & (n - 1)) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
