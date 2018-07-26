
import java.util.HashMap;
import java.util.Map;


public class DictionaryPractice{

	public static void main(String[] args) {

		//

		Map<String,String> englSpanDictionary = new HashMap<>();

		englSpanDictionary.put("Monday","Lunes");
		englSpanDictionary.put("Tuesday","Martes");
		englSpanDictionary.put("Wednesday","Miércoles");
		englSpanDictionary.put("Thursday","Jueves");
		englSpanDictionary.put("Friday","Viernes");
		englSpanDictionary.put("Saturday","Sábado");
		englSpanDictionary.put("Sunday","Domingo");


		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thursday"));
		System.out.println(englSpanDictionary.get("Friday"));

		// Print out all keys
		System.out.println(englSpanDictionary.keySet());

		//Print out all values
		System.out.println(englSpanDictionary.values());

		//Print out the size of the dictionary
		System.out.println("The size of the dictionary is " + englSpanDictionary.size());



		//Shopping list
		Map<String,Boolean> shoppingList = new HashMap<>();
		
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", Boolean.FALSE);


		//Retrieve items
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Sugar"));

		System.out.println(shoppingList.toString());

		//remove
		shoppingList.remove("Eggs");

		//replace
		shoppingList.replace("Bread", Boolean.FALSE);

		//clear the dictionary
		shoppingList.clear();
		System.out.println(shoppingList.toString());

		System.out.println(shoppingList.isEmpty());







	}
}