// Make a progrm that asks for the last name of the user. Depending on their last name, make a statement about how long they have to wait 
// during roll call. You need to use else ifs to make sure only one statement gets printed.
// Use compareTo()

package exercises2;

import java.util.Scanner;

public class Ifstatements15 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Please enter your last name: ");
		String lname = userin.next();
		
		if(lname.compareTo("Carswell")<=0) {
			System.out.println("You dont have to wait long, "+lname);
		}
		else if(lname.compareTo("Jones")<=0) {
			System.out.println("That's not bad, "+lname);
			
		}
		else if(lname.compareTo("Smith")<=0) {
			System.out.println("Looks like a bit of a wait "+lname);
		}
		else if(lname.compareTo("Young")<=0) {
			System.out.println("It's gonna be a while "+lname);
		}
		else if(lname.compareTo("Young")>0) {
			System.out.println("Not going anywhere for a while "+lname);
		}
	}
}
