
import java.util.Arrays;

public class ArrayPractice{

	public static void printArray(int[] arr){
		String sep = "";
		System.out.print("[");
		for(int x: arr){
			System.out.print(sep + x);
			sep = ", ";
		}
		System.out.println("]");
	}

	public static void printReverse(int[] arr){
        int[] arrReverse = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
        	arrReverse[arr.length - 1 - i] = arr[i];
        }
        for(int x : arrReverse){
        	System.out.print(x + " ");
        }
    }




	public static void main(String[] args) {
		

		// Declaring, Allocating, and Initializing Array
		int[] intArray1;
		int[] intArray2 = new int[4];
		int[] intArray3 = {4,6,8,9,1,2,0};

		String[] stringArray1 = {"bananas","apples","pears"};


		printArray(intArray2);
		intArray2[0] = 5;
		intArray2[1] = 99;
		intArray2[2] = 38;
		intArray2[3] = 5;

		printArray(intArray2);

		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		System.out,println(Arrays.get(intArray3, 2));


		// Given functions

		Arrays.sort(intArray2);
		printArray(intArray2);

	}
}