// Write a calculator program. This program will support the following functions: numbers with decimals, addition, subtraction,
// division, exponents, and error messages when you do something wrong.
// It should keep running until you make it quit (if the first number you type in is a 0, make it stop)

package exercises2;

import java.util.Scanner;

public class Project2Calculator {
		public static void main( String[] args )
		{
			Scanner userin = new Scanner(System.in);

			double a, b, c;
			String opsym;

			do
			{
				System.out.print("> ");
				a  = userin.nextDouble();
				opsym = userin.next();
				b  = userin.nextDouble();
				
				if ( opsym.equals("+") ) {
					c = a + b;
					}
				else if ( opsym.equals("*") ) {
					c = a * b;
					}
				else if ( opsym.equals("/") ) {
					c = a / b;
					}
				else if ( opsym.equals("-") ) {
					c = a - b;
					}
				else if(opsym.equals("^")) {
					c=Math.pow(a, b);
					}
				else if(opsym.equals("%")) {
					c = a%b;
					}
				
				
				
				else
				{
					System.out.println("Undefined operator: '" + opsym + "'.");
					c = 0;
				}
				
				if(a == 0) {
					System.out.println("You have entered a 0 as your first number,Goodbye");
				}
				else {
				System.out.println(c);}

			} while (a != 0 );
		}
	}
