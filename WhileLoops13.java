// Write a program that starts with three "piles" of counters each. Let the player choose piles and remove counters until all the piles are
// empty.
// Start by placing counters(coins or toothpicks or something.) into 3 piles
// The player picks a pile, then removes one or more counters from that pile.(It is okay to take the whole pile)
// The player picks a new pile, then removes one or more counters from that pile.(It is okay to pick the same pile as before)
// Once all piles are empty, the game stops

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class WhileLoops13 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("There are 3 piles");
		int pile1 = 1+randi.nextInt(5);
		int pile2 = 1+randi.nextInt(5);
		int pile3 = 1+randi.nextInt(5);
		//System.out.println("Pile A: "+pile1+"\tPile B: "+pile2+"\tPile C: "+pile3);
		System.out.println();
		String userpick;
		int usertake;
		//System.out.println("Choose a pile");
		while(pile1 != 0 || pile2!=0 || pile3 != 0) {
			System.out.println("Pile A: "+pile1+"\tPile B: "+pile2+"\tPile C: "+pile3);
			System.out.println();
			System.out.println("Choose a pile");
			System.out.print(">> ");
			userpick = userin.next();
			if(userpick.equals("A")) {
				System.out.println("How many to remove from pile?");
				usertake = userin.nextInt();
				pile1 = pile1 - usertake;
				
				
			}
			if(userpick.equals("B")) {
				System.out.println("How many to remove from pile?");
				usertake = userin.nextInt();
				pile2 = pile2 - usertake;
				
			}
			if(userpick.equals("C")) {
				System.out.println("How many to remove from pile?");
				usertake = userin.nextInt();
				pile3 = pile3 - usertake;
				
			}
			
			
		}
		System.out.println("All piles are now empty!");
	}
}
