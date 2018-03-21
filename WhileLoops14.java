// Nim is a strategy game between two players
// Start by placing counters into 3 piles.
// Player 1 picks a pile, then removes one or more counters from that pile(You can take the whole pile)
// Player 2 picks a pile, and does the same
// Then Player one goes again.
// This goes on until there are no more counters, whoever can not take any more counters loses.

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class WhileLoops14 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("There are 3 piles");
		System.out.print("Player 1 enter your name: ");
		String player1 = userin.next();
		System.out.print("Player 2 enter your name: ");
		String player2 = userin.next();
		int pile1 = 1+randi.nextInt(5);
		int pile2 = 1+randi.nextInt(5);
		int pile3 = 1+randi.nextInt(5);
		int wincounter = 0;
		
		System.out.println();
		String userpick;
		int usertake;
		
		while(pile1 != 0 || pile2!=0 || pile3 != 0) {
			System.out.println("Pile A: "+pile1+"\tPile B: "+pile2+"\tPile C: "+pile3);
			System.out.println();
			
			System.out.println(player1+" Choose a pile");
			wincounter++;
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
			
			
			System.out.println("Pile A: "+pile1+"\tPile B: "+pile2+"\tPile C: "+pile3);
			System.out.println();
			if(pile1 != 0 || pile2!=0 || pile3 != 0) {
			System.out.println(player2+" Choose a pile");
			wincounter++;
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
			
			//System.out.println(player1+ " There are no more counters You WIN");
		}if(wincounter%2 != 0) {
			System.out.println(player2+" WINS");
		}else {System.out.println(player1+" WINS");}
		
	}
}
