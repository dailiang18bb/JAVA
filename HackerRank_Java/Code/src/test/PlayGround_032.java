package test;

public class PlayGround_032 {
	
	public static void main(String[] args) {
		double profit = 0.02;
		double base = 5000;
		double days = 30;
		
		for(int i = 0; i < days; i++) {
			base = base * (1+profit);
			System.out.println(i);
			System.out.println(base * profit);
			System.out.println(base);
			System.out.println("----------------");
		}
		
		
	}

}
