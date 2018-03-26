// Create an array that can hold 1000 integers. Fil the array with random numbers in the range 10-99. Then display the contents of the 
// array on the screen. Use a loop

package exercises2;

import java.util.Random;

public class Arrays4 {
	public static void main(String[] args) {
		Random randi = new Random();
		int newarr[] = new int[1000];
		
		for(int counter = 0;counter<newarr.length;counter++) {
			newarr[counter]= 10+randi.nextInt(99);
			System.out.print(newarr[counter]+"  ");
		}
	}
}
