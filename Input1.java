// Write a Java program to get input and fill in the following fields asked and show the input values

package exercises2;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		String age = userin.nextLine();
		
		System.out.print("How many feet tall are you? ");
		int tall1 = userin.nextInt();
		
		System.out.print("How many inches? ");
		int tall2 = userin.nextInt();
		
		System.out.print("How much do you weigh in pounds? ");
		int weig = userin.nextInt();
		
		System.out.println("So you are "+age+" years old, "+tall1+" feet "+tall2+ " inches and weigh "+weig+ " pounds");
	}
}
