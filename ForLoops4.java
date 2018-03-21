// Write a program that gets three integers from the user. Count from the first number to the second numbr in increments of the third number.
// Use a for loop

package exercises2;

import java.util.Scanner;

public class ForLoops4 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("What number would you like to count from?");
		System.out.print(">> ");
		int startnum = userin.nextInt();
		
		System.out.println("What number would you liek to count to?");
		System.out.print(">> ");
		int endnum = userin.nextInt();
		
		System.out.println("How would you like to increment the count?");
		System.out.print(">> ");
		int increm = userin.nextInt();
		
		for(int counter = startnum;counter <= endnum;counter+=increm) {
			System.out.print(counter+"\t");
		}
	}
}
