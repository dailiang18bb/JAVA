



public class Animal{

	public Animal(){
		System.out.println("An animal has been created!");
	}

	public void eat(){
		System.out.println("An animal is eating!");
	}

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		d.ruff();
		c.meow();
		a.eat();
		d.eat();
		c.eat();
		d.run();
		c.prance();

	}
}