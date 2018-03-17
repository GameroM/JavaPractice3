// Write a program that gets several integers from the user. Sum up all the integers they give you. Stop looping when they enter a 0.
// Display the totl at the end.

package exercises2;

import java.util.Scanner;

public class WhileLoops8 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("I will add all the numbers you give me, until you give me a 0.");
		System.out.print("Number 1: ");
		int usernum = userin.nextInt();
		int total = 0;
		int tries = 1;
		while(usernum != 0) {
			total+=usernum;
			System.out.println("The total so far is:"+(total));
			System.out.print("Number "+(tries+1)+": ");
			usernum=userin.nextInt();
			tries++;
			
		}
		System.out.println();
		System.out.println("The grand total is: "+total);
	}
}
