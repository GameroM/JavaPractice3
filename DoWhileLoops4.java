// Make a number guessing game to ask the user to guess a number between 1 and 10. Count how many guesses, and  use a do while loop

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class DoWhileLoops4 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("Try to guess a number between 1 and 10.");
		int randonum = 1+randi.nextInt(10);
		int userguess;
		int tries = 0;
		
		do {
			
			System.out.print("Your guess: ");
			userguess = userin.nextInt();
			tries++;
			if(randonum != userguess) {
				System.out.println("Incorrect. Guess again.");
			}
			
			
		}
		while(randonum != userguess);
		System.out.println("Thats right, it only took you "+tries+" tries");
	}
	
}
