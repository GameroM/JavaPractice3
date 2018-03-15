// Write an interactive quiz. It should ask the user three multiple choice or true/false questions about something.
// It must keep track of how many they got wrong and print out a score at the end

package exercises2;

import java.util.Scanner;

public class Ifstatements7 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		int counter = 0;
		
		System.out.println("Question 1: What is the captial of Illinois?");
		System.out.println("\t1)Springfield\n\t2)Chicago\n\t3)Park Forest");
		
		System.out.print(">>>");
		int quest1 = userin.nextInt();
		if (quest1 == 1) {
			System.out.println("Correct!!");
			counter++;
		}
		else {
			System.out.println("Wrong, the correct answer was Springfield!! ");
		}
		System.out.println();
		System.out.println("Question 2: Canyou store the value cat in a variable of type int?");
		System.out.println("\t1)Yes\n\t2)No");
		
		System.out.print(">>>");
		int quest2 = userin.nextInt();

		if(quest2 == 2) {
			System.out.println("Correct!!");
			counter++;
		}
		else {
			System.out.println("Wrong, the correct answer was No!!");
		}
		System.out.println();
		System.out.println("Question 3: What is 9+6/3");
		System.out.println("\t1)5\n\t2)11\n\t3)15/3");
		
		System.out.print(">>>");
		int quest3 = userin.nextInt();
		
		
		if(quest3== 2) {
			System.out.println("Correct!!");
			counter++;
			
		}
		else {
			System.out.println("Wrong the correct answer was 11!!");
		}
		System.out.println();
		System.out.println("Overall you got "+counter+" out of 3 correct");
		System.out.println("Thanks for playing!!");
	}
}
