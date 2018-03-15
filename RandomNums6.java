// Write a program that picks a random number from 1-100. Give teh user a chance to guess it. If they get it right, tell them so.
// If their guess is higher than the number, say "Too high". If their guess is lower than the number say "Too low". THen quit
// For now dont give any more guess

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class RandomNums6 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		int numba = 1+randi.nextInt(100);
		
		System.out.println("I am thinking of a number between 1 and 100. Try to guess it!");
		System.out.print(">> ");
		int guess = userin.nextInt();
		
		if(guess < numba) {
			System.out.println("Too low, I was thinking of "+numba);
		}
		else if(guess > numba) {
			System.out.println("Too high, I was thinking of "+numba);
		}
		else if(guess == numba) {
			System.out.println("Congrats you guessed right ");
		}
	}
}
