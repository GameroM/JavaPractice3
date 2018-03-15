// Using the BMI calculator you previously created, use  if statements to modify it and give the exact category  for a given BMI

package exercises2;

import java.util.Scanner;

public class Ifstatements12 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Enter your weight in pounds: ");
		double weigp = userin.nextDouble();
		
		System.out.print("Enter your height in feet: ");
		int heif = userin.nextInt();
		
		System.out.print("Enter your height in inches: ");
		int heii = userin.nextInt();
		
		int heius = (heif*12)+heii;
		
		double weikg = weigp*0.453592;
		double heimet = heius*0.0254;
		
		double bmi = weikg/(heimet*heimet);
		
		System.out.println("Your bmi is: "+bmi);
		System.out.println();
		
		if(bmi<18.5) {
			System.out.println("You are underweight! ");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("You are normalweight! ");
		}
		else if(bmi>=25 && bmi<=29.9) {
			System.out.println("You are overweight! ");
			
		}
		else if(bmi>=30) {
			System.out.println("You are obese!! ");
		}
		else {
			System.out.println("dont have claculations for you");
		}
	}
}
