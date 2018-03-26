// Create an array that can hold ten integers, and fill each solt with a different random value from 1-50. Display those values on the screen
// Then prompt the user for an integer. Search through the array, and if the user input is in the array say so. Dont have to show anything
// if the number is not in the array. If the item is in the array multiple times, its ok for the program to print out the message more than
// once.

package exercises2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays6 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.print("Array: ");
		int array1[] = new int[10];
		for(int counter = 0;counter<array1.length;counter++) {
			array1[counter]= 1+randi.nextInt(50);
			System.out.print(array1[counter]+"  ");
		}
		System.out.println();
		System.out.print("Enter a number: ");
		int usernum = userin.nextInt();
	
		if(contains(array1,usernum)) {
			System.out.println("The number "+usernum+" is in the array.");
		}
		
	}
	public static boolean contains(final int[] array, final int v) {
		boolean result = false;
		for(int i : array) {
			if(i ==v) {
				result = true;
				break;
				
			}
		}
		return result;
	}
}
