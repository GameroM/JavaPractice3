// Write a program to allow the user to enter three integers. You must use do while or while loops to enforce that these integers
// are in ascending order, though duplicate numbers are allowed.
// Tell the user whether or not these integers would represent the sides of a right triangle.

package exercises2;
import java.util.Scanner;

public class WhileLoops10 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter three integers: ");
		System.out.print("Side 1: ");
		int side1 = userin.nextInt();
		System.out.print("Side 2: ");
		int side2 = userin.nextInt();
		
		while(side2 < side1) {
			System.out.println(side2+" is smaller than "+side1+", Try again.");
			System.out.print("Side 2: ");
			side2 = userin.nextInt();
		}
		System.out.print("Side 3: ");
		int side3 = userin.nextInt();
		
		
		while(side3 < side2) {
			System.out.println(side3+" is smaller than "+side2+", Try again.");
			System.out.print("Side 3: ");
			side3 = userin.nextInt();
			}
		System.out.println();
		System.out.println("The sides are: "+side1+" "+side2+ " "+side3);
		if(Math.pow(side1, 2)+Math.pow(side2, 2)==Math.pow(side3,2)) {
			System.out.println("These sides DO make a right triangle");
		}
		else {
			System.out.println("These sides do not make a right triangle");
		}
		}
		
	}


