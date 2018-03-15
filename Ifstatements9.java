// Make a choose your own adventure game. The starting room shoul give the user two choices. THen the second room they travel to should give
// them two more choices. Finally the third room should give them two choices.
// There should be 8 possible "endings". The game will also have a total of fifteen rooms
// You must use nested if statements to do this

package exercises2;

import java.util.Scanner;

public class Ifstatements9 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Welcome to Mario's RPG builder:");
		System.out.println();
		System.out.println("You get transported to a new world where you can choose to be a warrior or a mage. Which do you choose? ");
		System.out.print(">>");
		String choice = userin.next();
		if(choice.equals("mage")) {
			System.out.println("So you have chosen the mage, Good luck!\nNow you have to pick a weapon. Would you rather a staff"
					+ " or a wand?");
			System.out.print(">>");
			String choice2m = userin.next();
			
			if(choice2m.equals("staff")) {
				System.out.println("A staff, wise choice!\nNow would you like to specialize in fire or frost magic?");
				System.out.print(">>");
				String choice3m =userin.next();
				if(choice3m.equals("fire")) {
					System.out.println("Congrats you are a fire mage that wields a staff");
				}
				if(choice3m.equals("frost")) {
					System.out.println("Congrats you are a frost mage that wields a staff");
				}
				
			}
			if(choice2m.equals("wand")) {
				System.out.println("A wand, nice decision!\nNow would you like to specialize in destruction or demonology?");
				System.out.print(">>");
				String choice3mb = userin.next();
				if(choice3mb.equals("destruction")) {
					System.out.println("Congrats you are a destruction mage that wields a wand");
				}
				if(choice3mb.equals("demonology")) {
					System.out.println("Congrats you are a demonology mage that wields a wand");
				}
				
			}
			
		}
		else if(choice.equals("warrior")) {
			System.out.println("So you have chosen the warrior, Good luck!\nNow would you rather be fury or a paladin?");
			System.out.print(">>");
			String choicewar = userin.next();
			if(choicewar.equals("fury")) {
				System.out.println("Nice you have chosen fury warrior,now do want to dual wield? Yes or no?");
				System.out.print(">>");
				String choicewar1 = userin.next();
				if(choicewar1.equals("yes")) {
					System.out.println("Congrats you are a dual-wielding fury warrior");
				}
				if(choicewar1.equals("no")) {
					System.out.println("Congrats you are a fury warrior that only wields one weapon");
				}
			}
			if(choicewar.equals("paladin")) {
				System.out.println("Nice you chose to be a paladin!\nWould you like to be protection or retribution?");
				System.out.print(">>");
				String choicepal = userin.next();
				if(choicepal.equals("protection")) {
					System.out.println("Congrats you chose the warrior path and became a protection paladin!");
				}
				if(choicepal.equals("retribution")) {
					System.out.println("Congrats you chose the warrior path and became a retribuition paladin");
				}
			}
			
		}
		else {
			System.out.println("error");
		}
		
	}
}
