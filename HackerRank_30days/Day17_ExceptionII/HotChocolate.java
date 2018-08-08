public class HotChocolate{

	public static final double TOO_HOT = 185;
	public static final double TOO_COLD = 160;


	public static void main(String[] args) {

		double currentCocoaTemp = 100;
		try{
			drinkHotChocolate(currentCocoaTemp);
			System.out.println("That cocoa was good!");
		} catch(TooHotException e1){
			System.out.println("THAT's TOO HOT!!!");
		} catch (TooColdException e2){
			System.out.println("THAT's TOO COLD!!!It's like the arctic");
		}

		System.out.println("And it's gone!");
	}

	public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException{
		if(cocoaTemp >= TOO_HOT){
			throw new TooHotException();
		} else if(cocoaTemp <= TOO_COLD){
			throw new TooColdException();
		}
	}



}

class TemperatureException extends Exception{
	
}


class TooColdException extends TemperatureException{

}

class TooHotException extends TemperatureException{


}