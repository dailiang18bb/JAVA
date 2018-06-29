package test;


public class PlayGround_001 {

	public static void main(String args[]) {
		Dog o = new Dog();
		Object a = o;
		
		o.run();

		if (a instanceof Dog) {
			Dog dog = (Dog) a;
			dog.run();
			
			System.out.println(dog);
			System.out.println(o);
			
			
			for(int i=0;i<10;i++) {
				System.out.println("Loop number" + i);
			}
			System.out.println("----------------------------");
			for(int i=0;i<10;++i) {
				System.out.println("Loop number" + i);
			}

		}
	}

}

class Dog {
	private String name;
	
	void run() {
		System.out.println("running");
	}
}
