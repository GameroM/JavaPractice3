// Make a program to roll two dice until you get doubles(matching rolls). There is no user input, it is just a dice roll.

package exercises2;

import java.util.Random;

public class WhileLoops3 {
	public static void main(String[] args) {
		Random randi = new Random();
		
		System.out.println("Time to roll dice!!");
		System.out.println();
		int roll1 = 1+randi.nextInt(6);
		int roll2 = 1+randi.nextInt(6);
		System.out.println("Roll 1: "+roll1);
		System.out.println("Roll 2: "+roll2);
		System.out.println("The total of the roll rolls is: "+(roll1 + roll2));
		
		while(roll1 != roll2) {
			roll1 = 1+randi.nextInt(6);
			roll2 = 1+randi.nextInt(6);
			System.out.println("Roll 1: "+roll1);
			System.out.println("Roll 2: "+roll2);
			System.out.println("The total of the roll rolls is: "+(roll1 + roll2));
			System.out.println();
		}
		System.out.println("You have rolled doubles");
	}
}
