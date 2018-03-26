// Use nested for loops to generate a list of all the two digit numbers which are less than or equal to 56, and the sum of whose digits
// is greater than 10. Use another set of nested frr loops to find a two digit number such that the number itself minus the number reversed
// is equal to the sum of its digits.
// Put the code for each of the two parts into its own separate function, and have a menu in main(), which allows you to choose which of
// the two sets to find. This main program should keep repeating until you chooose to quit.

package exercises2;

import java.util.Scanner;

public class NestedLoops7 {
	
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		int useroption;
		do {
			System.out.println("\n1) Find two digit numbers <=56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits. ");
			System.out.println("3) Quit");
			System.out.println();
			System.out.print(">>");
			useroption = userin.nextInt();
			if(useroption==1) {
				System.out.println();
				nums56();
			}
			if(useroption==2) {
				System.out.println();
				numsrev();
			}
		
		}while(useroption != 3);
		System.out.println("You picked option 3. Goodbye");
	}
	public static void nums56() {
		
		for(int counter = 1;counter<6;counter++) {
			for(int counter2 = 0;counter2<7;counter2++) {
				String fdigit = String.valueOf(counter);
			    String sdigit = String.valueOf(counter2);
			    int suma = Integer.parseInt(fdigit)+Integer.parseInt(sdigit);
			    if(suma>10) {
			    System.out.println(fdigit+sdigit+" "+ fdigit+" + "+sdigit+ " = "+suma);
			}
			}
			
		}
	}
	public static void numsrev() {
		for(int counter = 1;counter<10;counter++) {
			for(int counter2 =0;counter2<10;counter2++) {
				String fdigit = String.valueOf(counter);
				String sdigit = String.valueOf(counter2);
				int num = Integer.parseInt(fdigit+sdigit);
				int numrev = Integer.parseInt(sdigit+fdigit);
				int dif = num -numrev;
				int suma = Integer.parseInt(fdigit)+Integer.parseInt(sdigit);
				if(dif == suma) {
					System.out.println(num+" "+num+" - "+numrev+" = "+dif+" and "+ fdigit + " + "+sdigit+" = " +suma);
				}
				
			}
		}
	}
	

}
