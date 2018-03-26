// Write a program that asks the user for a name. Display it 10 times using a loop, IF the name is "Mitchell" only display it five times.
// The challenge here is only use one if(no else), and one for loop

package exercises2;

import java.util.Scanner;

public class ForLoops12 {
	public static void main(String[] args) {
		Scanner userin= new Scanner(System.in);
		System.out.print("Please enter a name: ");
		String name = userin.next();
		System.out.println();
		int times = 10;
		
		for(int counter=1;counter<=times;counter++) {
			if(name.equals("Mitchell")) {
				times = 5;
			}
			System.out.println(counter+" "+name);
		}
	}
}
