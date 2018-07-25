package test;



public class PlayGround_017 {
	public static void main(String[] args) {
		
	}
	

}


class Add{
	public void add(int... num){
		int sum = 0;
		for(int i=0; i<num.length -1;i++) {
			System.out.print(num[i] + "+");
			sum += num[i];
		}
		System.out.print(num[num.length -1] + "=");
		sum += num[num.length -1];
		System.out.println(sum);

	}
}
