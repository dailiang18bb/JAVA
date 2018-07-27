


public abstract class Animal{

	private int age;

	public Animal(){
		System.out.println("An animal has been created!");
	}

	public abstract void eat();

	public void sleep(){
		System.out.println("An animal is sleeping.");

	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		d.eat();
		c.eat();
		d.sleep();
		c.sleep();

		//Casting
		Object dog = new Dog();
		Dog realDog = (Dog) dog;
		realDog.ruff();

		Object str = "Testing code";
		String realStr = (String) str;
		realStr.getBytes();


		// instanceof
		Dog doggy = new Dog();
		if (doggy instanceof Animal){
			Animal animal = (Animal) doggy;
			animal.sleep();
		}
		doggy.sleep();

	}
}