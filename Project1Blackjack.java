// Write a progam that allows a human user to play a simplified version of Blackjack against a computer opponent. Make it as cool as you can.
// Simplified rules are:
// There are no suits or face cards, all cards have a value from 2 to 11 with the same probability of drawing each
// Draw two cards for the player and display them
// Draw two cards for the dealer, but only display one, the other stays hidden
// The player can "hit" as many times as he likes
// If the player "busts" (hits over 21), the dealer automatically wins
// The dealer also hits as many times as he would like, make it so he hits when he has 16 or lower
// If the dealer busts, the player automatically wins
// If no one has busted, the player with the highest total wins. Dealer wins all ties

package exercises2;

import java.util.Scanner;
import java.util.Random;

public class Project1Blackjack {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("Time to play blackjack");
		int pcard1 = 2+randi.nextInt(11);
		int pcard2 = 2+randi.nextInt(11);
		System.out.println("You get a "+pcard1+" and a "+pcard2+" to start out.");
		int ptotal = pcard1+pcard2;
		System.out.println("Your total is "+ptotal);
		
		
		int dcard1 = 2+randi.nextInt(11);
		int dcard2 = 2+randi.nextInt(11);
		System.out.println("\nThe dealer has a "+dcard1+" showing, and a hidden card");
		System.out.println("His total is hidden as well");
		int dtotal = dcard1+dcard2;
		int counter = 0;
		
		
				
		if(ptotal<22) {
			System.out.println("\nWould you like to \"hit\" or \"stay\"?");
			String pchoice = userin.next();
			while(pchoice.equals("hit")&&ptotal<22) {
				int phit = 2+randi.nextInt(11);
				System.out.println("YOU drew "+phit);
				ptotal += phit;
				System.out.println("Your total is "+ptotal);
				
				if(ptotal<22) {
					System.out.println("\nWould you like to \"hit\" or \"stay\"?");
					pchoice = userin.next();
				}else {
					System.out.println("You busted, the dealer wins");
					counter+=1;
					}
			}
		}
		if(counter == 0) {
			System.out.println("Okay, dealers turn.");
			System.out.println("His hidden card was "+dcard2);
			System.out.println("His total was "+dtotal);
			while(dtotal<=16) {
				System.out.println("The dealer selects to hit");
				int dhit = 2+randi.nextInt(11);
				System.out.println("He drew "+dhit);
				dtotal+=dhit;
				System.out.println("Dealers total is: "+dtotal);
				
			}
			if(dtotal>21) {
				System.out.println("THe dealer busted, Player wins");
			}
			else if(dtotal>ptotal) {
				System.out.println("Dealer wins");
			}
			else if(dtotal==ptotal) {
				System.out.println("Dealer wins");
			}
		}
			
	}
}