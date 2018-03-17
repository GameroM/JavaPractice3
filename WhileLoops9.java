// Write a program to take the square root of a number typed in by the user. Your program should use a loop to ensure
// that the number tey typed in is positive. If the number is negative, you should print out some sort of warning and make them type it again
// Note that this is possible with either a while loop or a do- while loop. 
// Dont get square root if the number is ot positive.

package exercises2;

import java.util.Scanner;

public class WhileLoops9 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Square Roots");
		System.out.print("Enter a number to find its square root, make sure it is positive: ");
		double usernum = userin.nextDouble();
		while(usernum <0) {
			
				System.out.println("Your number is negative, Input another number");
				System.out.print(">> ");
				usernum = userin.nextDouble();
				
			
			
		}
		System.out.println("The square root of "+usernum+" is "+(Math.sqrt(usernum)));
	}
}
