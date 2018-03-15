// Ask user for several pieces of information, and display them on screen afterwards
// first name, last name, grad, student id, login name, gpa
// use appropiate data types

package exercises2;

import java.util.Scanner;

public class Input4 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("First name: ");
		String fname = userin.nextLine();
		
		System.out.print("Last name: ");
		String lname = userin.nextLine();
		
		System.out.print("Grade: ");
		int grade = userin.nextInt();
		
		System.out.println("Student Id: ");
		int id = userin.nextInt();
		
		System.out.print("Login: ");
		String login1 = userin.next();
		
		System.out.print("GPA: ");
		double gpa = userin.nextDouble();
		
		System.out.println("Your information: ");
		System.out.println("\tLogin: "+login1);
		System.out.println("\tID: "+id);
		System.out.println("\tName: "+lname+", "+fname);
		System.out.println("\tGPA: "+gpa);
		System.out.println("\tGrade: "+grade);
	}
}
