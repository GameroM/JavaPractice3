// Using the code from Functions 12 we will make it work now.
// You will need 2 new variables in main, one to store the current number of keychains, and one to store the price per keychain
// The price should be $10 pero keychain
// add_keychains() will need to be passed one int, and have a return type of int. It will ask the user for the number of keychains
// to add to the order, and then return the new number of keychains
// remove_keychains() will need to be passed one int, and have a return type of int. It will ask the user for the number of keychains to remove
// from the order, and then return the new number of keychains
// view_order() will need to be passed two ints, and have a return type of void. It will display, on three different lines, the number of 
// keychains in the order, the price per keychain, and the total cost of the order
// checkout() will need to be passsed two ints, and have a return type of void. It will ask the user for his/her name in order to deliver them
// correctl, display the order information, and then thank the user, by name, for ordering.

package exercises2;

import java.util.Scanner;

public class Functions13 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		int userchoice;
		int keytotal=0;
		int pricekey = 10;
		int usernum;
		double tax = 0.0825;
		int shipping = 5;
		int extrakey =1;
		
		do {
			System.out.println("\n1. Add Keychains to Order.");
			System.out.println("2. Remove Keychains from Order.");
			System.out.println("3. View Current Order.");
			System.out.println("4. Checkout.");
			System.out.print("\nPlease enter your choice: ");
			userchoice = userin.nextInt();
			if(userchoice==1) {
				System.out.print("how many to add? ");
				keytotal += add_keychains(usernum = userin.nextInt());
				
				System.out.println("You now have "+keytotal+" keychains");
				
			}
			else if(userchoice==2) {
				System.out.print("how many to subtract? ");
				keytotal -= remove_keychains(usernum = userin.nextInt());	
				System.out.println("You now have "+keytotal+" keychains");
				
			}
			else if(userchoice==3) {
				view_order(keytotal,pricekey,tax,shipping,extrakey);
			}
			else if(userchoice==4) {
				checkout(keytotal,pricekey,tax,shipping,extrakey);
			}else {System.out.println("\nERROR. Please choose an option from the menu");}
		}while(userchoice != 4);
		
		
		
		//end of main
	}
	public static int add_keychains(int keys) {
		
		
		return keys;
		
		
	}
	public static int remove_keychains(int keys) {
		return keys;
		
	}
	public static void view_order(int numkeys,double keyprice,double tax,int shipping,int xtrakey) {
		System.out.println("You have "+numkeys+" keychains.");
		System.out.println("Keys cost $10 each");
		double price = numkeys*keyprice+shipping+(numkeys*xtrakey);
		double finalprice = price+(price*tax);
		System.out.println("Total cost wihthout taxes and shipping is: $"+price);
		System.out.println("Total cost with taxes is: $"+finalprice);

	}
	public static void checkout(int totalkeys,double totalkeyprice,double tax, double shipping,double xtrakey) {
		Scanner userin = new Scanner(System.in);
		System.out.print("What is your name? ");
		String username = userin.next();
		System.out.println("You have "+totalkeys+" keychains.");
		System.out.println("Keychains cost $10 each");
		totalkeyprice =totalkeys*totalkeyprice+shipping+(totalkeys*xtrakey);
		double finaltotalprice = totalkeyprice+(totalkeyprice*tax);
		System.out.println("Your total cost is: $"+finaltotalprice);
		System.out.println("Thanks for your order "+username);
		
	}
}
