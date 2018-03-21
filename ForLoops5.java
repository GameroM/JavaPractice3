// Write a program that uses a for loop. With the loop, make the variable x go from -10 to 10, counting by 0.5

package exercises2;

import java.util.Scanner;

public class ForLoops5 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("We will start with -10 and count to 10");
		
		for(double counter = -10;counter <=10;counter+=0.5) {
			System.out.println(counter);
		}
	}
}
