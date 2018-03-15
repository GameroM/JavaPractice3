// Convert weight from earth to different planets depending on what the user selects.

package exercises2;

import java.util.Scanner;

public class Ifstatements6 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Please enter your weight on Earth in pounds: ");
		double weig = userin.nextInt();
		
		System.out.println("I have information on the following planets: ");
		System.out.println("\t1. Venus\t2. Mars\t\t3. Jupiter\n\t4. Saturn\t5. Uranus\t6.Neptune");
		
		System.out.print("Enter number of planet that you would like to convert your weight to: ");
		int num1 = userin.nextInt();
		
		if(num1 == 1) {
			System.out.println("Your weight on that planet would be: "+weig*0.78);
		}
		if(num1 == 2) {
			System.out.println("Your weight on that planet would be: "+weig*0.39);
		}
		if(num1 == 3) {
			System.out.println("Your weight on that planet would be: "+weig*2.65);
		}
		if(num1 == 4) {
			System.out.println("Your weight on that planet would be: "+weig*1.17);
		}
		if(num1 == 5) {
			System.out.println("Your weight on that planet would be: "+weig*1.05);
		}
		if(num1 == 6) {
			System.out.println("Your weight on that planet would be: "+weig*1.23+" pounds");
		}
		
	}
	
}
