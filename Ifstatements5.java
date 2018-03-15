// Using if, else if, and else make a program which displays a different message depending on age given, only one message!
// less than 16--You cant drive
// 16-17 ---You can drive but cant vote
// 18-24 ---You can vote but not rent a car
// 25 and older --- You can do pretty much anything

package exercises2;

import java.util.Scanner;

public class Ifstatements5 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("How old are you? ");
		int age = userin.nextInt();
		
		if(age<16) {
			System.out.println("You can't drive ");
		}
		else if(age ==16 || age ==17) {
			System.out.println("You can drive but can't vote");
		}
		else if(age == 18 || age <= 24) {
			System.out.println("You can vote but not rent a car");
		}
		else {
			System.out.println("You ccan do pretty much anything");
		}
	}
}
