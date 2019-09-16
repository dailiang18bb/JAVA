package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlayGround_026 {

//Write your code here:

	class Food {
		String name;

		public void serveFood() {
			System.out.println("I'm serving" + this.name);
		}

	}

	public class FoodFactory extends Food {
		String factoryName;

		public Food getFood(String s) {
			return new Food();
		}

		
	}

	public static void main(String[] args) {
		FoodFactory myFoods = new FoodFactory();
		
		Food food1 = myFoods.getFood("FastFood");
		Food food2 = myFoods.getFood("Fruit");
		
		System.out.println("My name is: " + food1.getClass().getName());
		System.out.println("My name is: " + food2.getClass().getName());
		System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();
	}

}
