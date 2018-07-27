public class Cat extends Animal {
	
	public Cat(){
		//super();
		System.out.println("A cat has been created!");
	}

	public void eat(){
		System.out.println("A cat is eating!");
	}

	public void meow(){
		System.out.println("The cat meows!");
	}

	public void prance(){
		System.out.println("A cat is prancing!");
	}

	@Override
	public void sleep(){
		System.out.println("A cat is sleeping.");
	}





}