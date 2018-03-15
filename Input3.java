// Write a program that asks user for their name, age, and salary. Display all 3, use appropiate data types!

package exercises2;

import java.util.Scanner;

public class Input3 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name= userin.nextLine();
		
		System.out.println("Hello "+name+", how old are you?");
		int age = userin.nextInt();
		
		System.out.println("So you are "+age+" Please enter your salary per hour: ");
		double salary = userin.nextDouble();
		
		System.out.println("Well I see you make "+salary+" per hour, very nice!");
	}
}
