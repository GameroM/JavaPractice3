// This is the original "ball and cups" game where you try to find out which cup has the ball under it. You may play with three
// cups and a ball, three cards(two jacks and an ace),or three doors and a car. Basically, randomly select a cup to hide the "ball".
// Let the player guess which cup hides the ball. The player wins if they guess correctly.

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class RandomNums7 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("There are three cards on the table. You must find which is the ace.");
		System.out.println("\t##\t##\t##");
		System.out.println("\t##\t##\t##");
		System.out.println("\t 1\t 2\t 3");
		System.out.print("Which one do you pick? ");
		int pick = userin.nextInt();
		
		int correct = 1+randi.nextInt(3);
		
		if(pick == correct) {
			System.out.println("Congrats you picked the correct card!!");
		}
		else if(pick!=correct) {
			System.out.println("You picked wrong it was under card "+correct);
		}
		if(correct == 1) {
			System.out.println("\tAA\t##\t##");
			System.out.println("\tAA\t##\t##");
			System.out.println("\t 1\t 2\t 3");
		}
		else if(correct == 2) {
			System.out.println("\t##\tAA\t##");
			System.out.println("\t##\tAA\t##");
			System.out.println("\t 1\t 2\t 3");
		}
		else if(correct == 3) {
			System.out.println("\t##\t##\tAA");
			System.out.println("\t##\t##\tAA");
			System.out.println("\t 1\t 2\t 3");
		}
	}
}
