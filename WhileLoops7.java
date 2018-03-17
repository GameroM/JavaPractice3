// Write a program that picks a random number from 1-100. The user keeps guessing as long as their guess is wrong, and they have guessed
// less than 7 times. If their guess is higher than the number, say "Too high" If their guess is lower than the number say "Too low."
// When they get it right the game stops. Or if they hit seven guesses, the game stops even if they never got it right

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class WhileLoops7 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("I am thinking of a number between 1 and 100. Try to guess it. You have 7 guesses");
		System.out.print("First Guess: ");
		int userguess = userin.nextInt();
		
		int randonum = 1+randi.nextInt(100);
		int tries = 1;
		
		while((randonum != userguess)&&(tries < 7)) {
			if(randonum < userguess) {
				System.out.println("Too high");
				System.out.print("Guess #"+(tries+1)+":");
				userguess = userin.nextInt();
				tries++;
			}
			else if(randonum > userguess) {
				System.out.println("Too low");
				System.out.print("Guess #"+(tries+1)+":");
				userguess = userin.nextInt();
				tries++;
			}
		}
		if(userguess == randonum) {
			System.out.println("Congrats, you finally guessed it.");
			System.out.println("It only took you "+tries+" tries");
		}
		else if(userguess != randonum) {
			System.out.println("Sorry, you could not guess the number in 7 tries. You lose");
		}
	}
	
}
