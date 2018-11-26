package java_exam_hackerrank_2018.q6;


public class Solution {
	
	class Inner{
		void test() {
			if(Solution.this.flag) {
				Sample();
			}
		}
	}
	private boolean flag = true;
	
	public void Sample() {
		System.out.println("Sample");
	}
	
	public Solution() {
		// TODO Auto-generated constructor stub
		(new Inner()).test();
	}

	public static void main(String[] args) {
		
		new Solution();
		
	}
}
