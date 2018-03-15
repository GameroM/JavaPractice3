// Make a program which plays a simple game of two questions. The first question should be "animal,vegetable,or mineral?". Then the 
// second question should be "is it bigger than a breadbox?". Then display one of six possible resposnes, depending on the answers

package exercises2;

import java.util.Scanner;

public class Ifstatements11 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("welcome to a game of TWO QUESTIONS!! ");
		System.out.println("Think of an object, I will try to guess it ");
		System.out.println("Question 1: Is it an animal, vegetable, or a thing?");
		System.out.print(">>");
		String q1r = userin.next();
		System.out.println("Question 2: Is it bigger than a breadbox? Yes or no? ");
		System.out.print(">>");
		String q2r = userin.next();
		if(q1r.equals("animal")&&q2r.equals("yes")) {
			System.out.println("You were thinking of a moose!");
		}
		if(q1r.equals("animal")&&q2r.equals("no")) {
			System.out.println("you were thinking of a squirrel! ");
		}
		if(q1r.equals("vegetable")&&q2r.equals("yes")) {
			System.out.println("You were thinking of a pumpkin!");
		}
		if(q1r.equals("vegetable")&&q2r.equals("no")) {
			System.out.println("you were thinking of an carrot ");
		}
		if(q1r.equals("thing")&&q2r.equals("yes")) {
			System.out.println("You were thinking of a car!");
		}
		if(q1r.equals("thing")&&q2r.equals("no")) {
			System.out.println("you were thinking of a paperclip! ");
		}
					
	}
}
