// Practice else and if by entering input values and comparing

package exercises2;

import java.util.Scanner;

public class Ifstatements3 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter number of people: ");
		int people = userin.nextInt();
		
		System.out.println("Enter number of cars: ");
		int cars = userin.nextInt();
		
		System.out.println("Enter number of buses: ");
		int buses = userin.nextInt();
		
		if(cars>people) {
			System.out.println("More cars than people");
		}
		else if(cars<people) {
			System.out.println("More people than cars");
		}
		else {
			System.out.println("People and cars are equal");
		}
		if(buses>cars) {
			System.out.println("More buses than cars");
			
		}
		else if(buses<cars) {
			System.out.println("More cars than buses");
		}
		else {
			System.out.println("Number of cars is equal to number of buses");
		}
		if(people>buses) {
			System.out.println("More people than buses");
		}
		else {
			System.out.println("More buses than people or equal number");
		}
	}
}
