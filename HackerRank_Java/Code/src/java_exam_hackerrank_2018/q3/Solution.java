package java_exam_hackerrank_2018.q3;

import java.util.*;


//Write your code here:

class Food {
	String foodName;

	public void setFoodName(String name) {
		this.foodName = name;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public void serveFood() {
		System.out.println("I'm serving " + this.foodName);
	}

}

class FastFood extends Food {
}

class Fruit extends Food {
}

class FoodFactory extends Food {
	String foodName;

	public Food getFood(String name) {
		if (name.equals("FastFood")) {
			Food f = new FastFood();
			f.foodName = name;
			return f;
		} else {
			Food f = new Fruit();
			f.foodName = name;
			return f;
		}
	}

}

class Solution {
 public static void main(String[] args) {
     FoodFactory myFoods = new FoodFactory();
     Food food1 = myFoods.getFood("FastFood");
     Food food2 = myFoods.getFood("Fruit");	
     System.out.println("My name is: " + food1.getClass().getName());
     System.out.println("My name is: " + food2.getClass().getName());
     System.out.println("Our superclass is: " 
                         + food1.getClass().getSuperclass().getName());
     food1.serveFood();
     food2.serveFood();
 }
}
