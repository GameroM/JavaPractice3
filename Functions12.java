// Write a program that pulls up a menu with 4 options.
// You will need to create functions for each of the 4 menu options. Entering the number will call the correct function.
// The assignment does not require you to complete ANY of the functionality except fro the working menu system. There is no need for you to 
// program the ability to add keychains, remove keychains, view orders, or checkout
// The functions should be named add_keychains(), remove_keychains(),view_order() and checkout().
// Each function should print a message that it has been called.
// The user should be able to keep putting in choices until the checkout function is called. When checkout() is finished the program shoudl end.

package exercises2;

import java.util.Scanner;

public class Functions12 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		int userchoice;
		
		do {
			System.out.println("\n1. Add Keychains to Order.");
			System.out.println("2. Remove Keychains from Order.");
			System.out.println("3. View Current Order.");
			System.out.println("4. Checkout.");
			System.out.print("\nPlease enter your choice: ");
			userchoice = userin.nextInt();
			if(userchoice==1) {
				add_keychains();
			}
			else if(userchoice==2) {
				remove_keychains();
			}
			else if(userchoice==3) {
				view_order();
			}
			else if(userchoice==4) {
				checkout();
			}
		}while(userchoice != 4);
		
	}
	public static void add_keychains() {
		System.out.println("\nADD KEYCHAINS");
		
	}
	public static void remove_keychains() {
		System.out.println("\nREMOVE KEYCHAINS");
		
	}
	public static void view_order() {
		System.out.println("\nVIEW ORDER");
		
	}
	public static void checkout() {
		System.out.println("\nCHECKOUT");
		
	}
}
