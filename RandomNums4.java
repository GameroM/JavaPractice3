// Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.
// For extra practice, add randomly chosen lotto numbers to the fortune. The lotto is 6 numbers, from 1-54

package exercises2;

import java.util.Random;

public class RandomNums4 {
	public static void main(String[] args) {
		Random randomiz = new Random();
		
		int fortunes = 1+randomiz.nextInt(6);
		String imagin = "";
		int lotto = 1+randomiz.nextInt(54);
		int lotto2 = 1+randomiz.nextInt(54);
		int lotto3 = 1+randomiz.nextInt(54);
		int lotto4 = 1+randomiz.nextInt(54);
		int lotto5 = 1+randomiz.nextInt(54);
		int lotto6 = 1+randomiz.nextInt(54);
		
		if(fortunes == 1) {
			imagin = "Fortune cookie says: You will find happiness with a new love!!";
		}
		else if(fortunes == 2) {
			imagin = "Fortune cookie says: You will get good money soon";
		}
		else if(fortunes == 3) {
			imagin = "Fortune cookie says: Dark times approach, be safe";
		}
		else if(fortunes == 4) {
			imagin = "Fortune cookie says: Party while you can";
		}
		else if(fortunes == 5) {
			imagin = "Fortune cookie says: Good luck coming your way";
		}
		else if(fortunes == 6) {
			imagin = "Fortune cookie says: THe world will end";
		}
		
		System.out.println(imagin+"\nLotto Numbers: "+lotto+"-"+lotto2+"-"+lotto3+"-"+lotto4+"-"+lotto5+"-"+lotto6);
		
	}
}
