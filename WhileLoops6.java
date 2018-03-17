// Make a program that makes the user guess a number that the computer thinks of. They can guess until they get it right, but 
// this time make it count the number of times they guess

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class WhileLoops6 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		
		int usernum = userin.nextInt();
		int randonum = 1+ randi.nextInt(10);
		int triescounter = 1;
		
		while(usernum != randonum) {
			System.out.println();
			System.out.print("Incorrect \nGuess again: ");
			usernum = userin.nextInt();
			triescounter++;
		}
		System.out.println();
		System.out.println("Congrats, you finally guessed it!!");
		System.out.println("It only took you "+triescounter+" tries");
	}
}
