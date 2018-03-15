// Write a program that plays an incredibly stupid number-guessing game. The user will get one try to guess the secret number. Tell them
// if they got it right or wrong, and if they got it wrong, display what the secret number was. You must store the secret number in a 
// variable, and use that variable throughout. The secret number itself must not appear in the program at all, except in the one line where
// you store it into a variable. It will be the same number everytime the game is played.

package exercises2;

import java.util.Scanner;

public class Ifstatements16 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Welcome to the worst number guessing game!!");
		System.out.println();
		System.out.print("Im thinking of a number from 1-10. Try to guess it!! ");
		int usernum = userin.nextInt();
		System.out.println();
		int val = 4;
		
		if(usernum == val) {
			System.out.println("Congratulations you guessed the number correctly!! It was indeed "+val);
		}
		else if(usernum != val) {
			System.out.println("You guessed incorrectly, the number was: "+val);
		}
	}
}
