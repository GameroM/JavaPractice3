// Write a program that allows a human user to play a single hand of "blackjack" against a dealer.
// 1. Pick two values from 1 to 10 for the player, these are the player's cards
// 2. Pick two more values from 1 to 10 for the dealer(the computer)
// 3. Whoever has the highest total wins.
// 4. There is no betting, no busting, and no hitting.

package exercises2;

import java.util.Random;

public class BabyBlackjack {

	public static void main(String[] args) {
		Random randi = new Random();
		
		System.out.println("Time to play a game of Baby Blackjack");
		int playercard1 = 1+randi.nextInt(10);
		int playercard2 = 1+randi.nextInt(10);
		System.out.println("\nYou drew "+playercard1+" and "+playercard2);
		int totalplayer = playercard1+playercard2;
		System.out.println("Your total is: "+totalplayer);
		
		int cpucard1 = 1+randi.nextInt(10);
		int cpucard2 = 1+randi.nextInt(10);
		System.out.println("\nDealer drew "+cpucard1+" and "+cpucard2);
		int totalcpu = cpucard1+cpucard2;
		System.out.println("Dealer's total is: "+totalcpu);
		
		if(totalplayer > totalcpu) {
			System.out.println("\nYOU WIN!! ");
		}else {
			System.out.println("\nThe Dealer WINS!!");
		}
	}
}
