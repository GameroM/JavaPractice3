// Modify the number guessing game you made so that they can guess until they get it right. It will keep asking for a guess
// until the guess is the number the machine thought of.

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class WhileLoops2 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("I have chose a number between 1 and 10. Try to guess it!!");
		System.out.print("Your guess: ");
		int guess = userin.nextInt();
		
		int rando = 1+randi.nextInt(10);
		
		while(guess!= rando) {
			System.out.println("Incorrect. Guess again. ");
			System.out.print(">> ");
			guess=userin.nextInt();
		}
		System.out.println("Correct, The number I was thinking of was indeed "+rando);
	}
}
