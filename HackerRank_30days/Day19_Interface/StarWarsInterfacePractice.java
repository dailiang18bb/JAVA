import java.util.Random;


public class StarWarsInterfacePractice{

	public static Character summonCharacter(){

		Random random = new Random();
		return Math.abs(random.nextInt()) % 2 == 0 ? new Enemy() : new Hero();

	}


	public static void main(String[] args) {

		Enemy darthVader = new Enemy();
		Hero ObiWanKenobi = new Hero();
		darthVader.attack();
		ObiWanKenobi.attack();
		darthVader.heal();
		ObiWanKenobi.heal();
		System.out.println("The enemy weapon is " + darthVader.getWeapon());
		System.out.println("The hero weapon is " + ObiWanKenobi.getWeapon());
		
		Character spy = summonCharacter();
		spy.attack();
		spy.heal();
	}
	
}