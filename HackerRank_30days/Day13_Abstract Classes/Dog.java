




public class Dog extends Animal{

	public Dog(){
		//super();
		System.out.println("An Dog has been created!");
	}

	public void eat(){
		System.out.println("A dog is eating!");
	}


	public void ruff(){
		System.out.println("The dog says ruff");
	}


	public void run(){
		System.out.println("A dog is running!");
	}


	@Override
	public void sleep(){
		System.out.println("A dog is sleeoing!");
	}
}