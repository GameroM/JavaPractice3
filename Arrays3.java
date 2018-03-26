// Create an array that can hold ten integers. Fill up each slot of the array with a random number from 1 to 100. Then display the contents 
// of the array on the screen. You must use a loop.

package exercises2;

import java.util.Random;

public class Arrays3 {
	public static void main(String[] args) {
		
		Random randi = new Random();
		
		
		int arra1[] = new int[10];
		
		for(int counter = 0;counter<arra1.length;counter++) {
			arra1[counter]=1+randi.nextInt(100);
			System.out.println("Slot "+counter+" contains a "+arra1[counter]);
		}
	}
}
