// Write a program to calculate the multiples of a given number. Have the user enter a number, and then use a for loop to display all the 
// multiples of that number from 1 to 12.

package exercises2;

import java.util.Scanner;

public class ForLoops13 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		int usernum = userin.nextInt();
		System.out.println();
		
		for(int counter = 1;counter<=12;counter++) {
			int multires = usernum*counter;
			System.out.println(usernum+"x"+counter+" = "+multires);
		}
	}
}
