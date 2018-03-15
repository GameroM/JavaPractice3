// Write a program to get user input on quantities of certain things and compare and print messages according
// to said quantites

package exercises2;

import java.util.Scanner;

public class Ifstatements1 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("How many people are there? ");
		int people = userin.nextInt();
		
		System.out.println("How many cats are there? ");
		int cats = userin.nextInt();
		
		System.out.println("How many dogs are there? ");
		int dogs = userin.nextInt();
		
		if(people<cats) {
			System.out.println("too many cats! World is doomed! ");
		}
		if(people>cats) {
			System.out.println("Not many cats! The world is saved! ");
			
		}
		if(people<dogs) {
			System.out.println("The world is drooled on! ");
		}
		if(people>dogs) {
			System.out.println("The world is dry! ");
			
		}
		dogs+=5;
		
		if(people>=dogs) {
			System.out.println("People are greater than or equal to dogs ");
			
		}
		if(people<=dogs) {
			System.out.println("People are less than or equal to dogs ");
		}
		if(people==dogs) {
			System.out.println("People are dogs");
		}
	}
}
