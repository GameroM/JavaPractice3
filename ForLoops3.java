// Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to o it.

package exercises2;

import java.util.Scanner;

public class ForLoops3 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Up to what number would you like to count to? ");
		System.out.print(">> ");
		int maxnum = userin.nextInt();
		
		for(int counter = 1; counter<= maxnum;counter++) {
			System.out.println(counter+"\t");
		}
	}
}
