package test;

public class PlayGround_011 {
	
	
	public static void main(String[] args) {
		int[][] A = new int[][] {
			{1,2,3},
			{4,5,6}
		};
		transpose(A);
		
		for(int x[]: A) {
				System.out.println(x);
		}
		System.out.println(Math.sqrt(100030001));

		
		
	}


	 public static int[][] transpose(int[][] A) {
	    int x = A.length;
		System.out.println(x);

	    int y = A[0].length;
		System.out.println(y);

	    int[][] B = new int[y][x];
	    for(int i = 0; i< y; i++){
	        for(int k = 0; k<x; k++){
                B[i][k] = A[k][i];
        		System.out.println(B[i][k]);

	        }
	    }
	    return B;
	}

}
