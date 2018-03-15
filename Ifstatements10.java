// Using if statements with coumpould conditions(like && ), make a program that displays a single message depending on the age given
// use only if, not else or else if
package exercises2;

import java.util.Scanner;

public class Ifstatements10 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Input name: ");
		String name = userin.nextLine();
		System.out.print("Input age: ");
		int age = userin.nextInt();
		
		if(age>0 && age<16) {
			System.out.println("You can't drive "+name);
		}
		if(age>=16 && age <= 17) {
			System.out.println("You can drive but not vote "+name);
			
		}
		if(age>=18 && age <=24) {
			System.out.println("You can vote but not rent a car "+name);
		}
		if(age>=25) {
			System.out.println("You can do pretty much anything "+name);
		}
			
		
	}
}
