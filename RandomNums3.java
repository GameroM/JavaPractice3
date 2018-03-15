// Modify the stupid number guessing game, to actually pick a random number from 1 to 10 and have the user try to guess that. Tell
// them if they get it right or wrong, and if they get it wrong, show them what the random number was. Still only give one try to user

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class RandomNums3 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Welcome to a number guessing game!!");
		System.out.println();
		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		int usernum = userin.nextInt();
		
		Random rand = new Random();
		int val = 1+rand.nextInt(10);
		
		if(usernum==val) {
			System.out.println("Correct I was indeed thinking of: "+val);
		}
		if(usernum != val) {
			System.out.println("Wrong, I was thinking of "+val);
		}
	}
}
