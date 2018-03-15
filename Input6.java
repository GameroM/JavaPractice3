// Make a calculator that takes in 3 numbers, adds all the numbers together then divides that result by 2
// Must support decimals

package exercises2;

import java.util.Scanner;

public class Input6 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = userin.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = userin.nextDouble();
		System.out.print("Enter third number: ");
		double num3 = userin.nextDouble();
		
		double result = (num1+num2+num3)/2;
		System.out.println("("+num1+" "+num2+" "+num3+")/2 is..."+result);
	}
}
