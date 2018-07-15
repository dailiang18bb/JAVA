package objectOrientedProgramming.Java_Java_Interface;

import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here

class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		if(n==1) {return 1;}

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0 && !arrayList.contains(n / i)) {
				arrayList.add(i);
				arrayList.add(n / i);
				sum = sum + i + n / i;
			}
		}

		return sum;
	}
}
// your codes ends here


class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

/**
 * 
 * 

//Solution starts
class MyCalculator implements AdvancedArithmetic {
 public int divisor_sum(int n) {
  int ans = 0;
  for (int i = 1; i <= n; i++) {
   if (n % i == 0) ans += i;
  }
  return ans;
 }
}
//Solution ends

 * 
 * 
 */

