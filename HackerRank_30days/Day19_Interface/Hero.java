public class Hero implements Character{
	
	public String weapon = "blue-lightsaber";

	public void attack(){
		System.out.println("The hero attacks the enemy!");
	}

	public void heal(){
		System.out.println("The hero heals you!");
	}

	public String getWeapon(){
		return weapon;
	}
}