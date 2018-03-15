// Make a program which displays an appropriate nae for a person,using a combination of nested ifs and compound conditions. Ask the user
// for a gender, first name, last name and age. If the person is female and 20 or over, ask if she is marred. If so, display "Mrs." in front
// of her name. If the female is under 20, display her first and last name.
// IF the person is male and 20 o over, display "Mr." in front of his name. Otherwise display his first and last name.
// Note that asking a person if they are arried should only be done if they are female and 20 or older, which means you will have a single if
// and else nested inside one of your if statements. 

package exercises2;

import java.util.Scanner;

public class Ifstatements13 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("What is your gender (M or F): ");
		String gender = userin.next();
		System.out.print("First name: ");
		String fname = userin.next();
		System.out.print("Last name: ");
		String lname = userin.next();
		System.out.print("Age: ");
		int age = userin.nextInt();
		System.out.println();
		
		if(gender.equals("M")&&age >=20) {
			System.out.println("Then I shall call you Mr. "+lname);
		}
		else if(gender.equals("M")&&age<20) {
			System.out.println("Then I shall call you "+fname+" "+lname);
		}
		else if(gender.equals("F")&&age<20) {
			System.out.println("Then I shall call you "+fname+" "+lname);
		}
		else if (gender.equals("F")&&age>=20) {
			System.out.println("are you married, "+fname+" (y or n) ");
			String marri = userin.next();
			if(marri.equals("y")) {
				System.out.println("Then I shall call you Mrs. "+lname);
			}
			else {
				System.out.println("Then I shall call you Ms. "+lname);
			}
		}
		
	}
}
