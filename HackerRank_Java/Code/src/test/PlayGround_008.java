package test;

public class PlayGround_008 {

	public static void main(String args[]) {

		//bits
		
		byte a = 88; // -128 to 127 // 2^8 = 256
		short b = 16; 
		int c = 32;
		long d = 64;
		
		float aa = 32.996432f;
		double bb = 64;
		
		char aaa = 16;
		
		int testArrayA[] = {1,2,3};
		
		int testArrayB[] = testArrayA;
	
		printArray(testArrayA);
		
		testArrayB[1] = 999;
		
		printArray(testArrayA);
		printArray(testArrayB);

		int [] testInteger = new int[3];
		
	}
	
	
	
	public static void printArray(int ar[]) {
		for(int x:ar) {
			System.out.println(x);
		}
	}
}
