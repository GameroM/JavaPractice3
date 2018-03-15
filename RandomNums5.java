// Write a program that simulates a dice roll by picking a random number from 1-6 and then picking a second random number from
// 1-6. Add the two values together, and display the total

package exercises2;

import java.util.Random;

public class RandomNums5 {
	public static void main(String[] args) {
		Random randice = new Random();
		
		System.out.println("Here comes the dice roll!!");
		System.out.println();
		
		int roll1= 1+randice.nextInt(6);
		int roll2 = 1+randice.nextInt(6);
		
		System.out.print("Roll 1: "+roll1);
		System.out.println();
		System.out.print("Roll 2: "+roll2);
		System.out.println();
		System.out.println("The total is: "+(roll1+roll2));
	}
}
