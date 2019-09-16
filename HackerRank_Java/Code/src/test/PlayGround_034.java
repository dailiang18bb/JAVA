package test;

public class PlayGround_034 {
	public static void main(String[] args) {
		
		int[] test = {1,2,3};
		add(test, 3);
		
		for(int x : test) {
			System.out.println(x);
		}
		
	}
	
	private static void add(int[] arr, int val) {
		arr[0] = val;
	}

}

