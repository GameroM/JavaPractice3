// Make a program that rolls two six sided dice until you get doubles, shows outcome and gives the sum. Use a do while loop

package exercises2;

import java.util.Random;

public class DoWhileLoops3 {
	public static void main(String[] args) {
		Random randi = new Random();
		int roll1;
		int roll2;
		int sum;
		
		System.out.println("Time to roll dice");
		do {
			roll1 = 1+randi.nextInt(6);
			roll2 = 1+randi.nextInt(6);
			System.out.println("Roll #1: "+roll1);
			System.out.println("Roll #2: "+roll2);
			sum = roll1+roll2;
			System.out.println("The total is: "+sum);
			
		}
		while(roll1 != roll2);
	}
}
