// write a program that gets an integer from the user. Add up all the numbers from 1 to that number and display the total. Use a for loop

package exercises2;

import java.util.Scanner;

public class ForLoops10 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter a number, I will return the sum of all the digits from 1 to your number:");
		System.out.print(">> ");
		int endnum = userin.nextInt();
		int sum = 0;
		
		for (int counter = 1;counter<=endnum; counter++) {
			System.out.print(counter+"  ");
			sum+=counter;
			
		}
		System.out.println("\nThe sum of the numbers 1 to "+endnum+" is: "+sum);
	}

}
