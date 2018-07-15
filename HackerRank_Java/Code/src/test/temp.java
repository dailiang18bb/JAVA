package test;


class temp {

	public static void main(String[] args) {
		temp t = new temp();
		System.out.println(t instanceof Object);
		int x = (int) Math.sqrt(10);
		System.out.println(Math.sqrt(10));
		while(x<100) {
			temp.go(43);
			x++;
		}
		
		

		String s = String.format("%, d", 1000000000);
		System.out.println(s);
	}

	static final int x;
	static {
		x= 3;
	}

	public static void go(final int x) {
		System.out.println((int)(Math.random() * 100 + 1));
	}

}
