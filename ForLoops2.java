// Write a program that prints a phrase on the screen ten times. Use a for loop.

package exercises2;

import java.util.Scanner;

public class ForLoops2 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter a message to print out: ");
		System.out.print(">> ");
		
		String userinp = userin.nextLine();
		for(int counter = 1; counter <= 10; counter++) {
			System.out.println(counter+". "+userinp);
		}
	}
}
