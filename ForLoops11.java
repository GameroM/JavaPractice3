// Write a program that prompts the user for a name. Then display that name ten times. Must use a loop. If the name is Mitchell
// only display it five times.

package exercises2;

import java.util.Scanner;

public class ForLoops11 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = userin.next();
		System.out.println();
		
		if(name.equals("Mitchell")) {
			for(int counter = 1; counter<=5;counter++) {
				System.out.println(counter+" "+name);
			}
		}else {
		for(int counter = 1;counter <=10;counter++) {
			System.out.println(counter+" "+name);
		}
		}
	}
}
