// BMI Calculator, Calculate body mass index by taking the individual's mass in kg and dividing it by the square of their 
// height in meters
// For extra practice, have user input their height and weight in inches and pounds, convert to kg and meters and
// find the calculations with that

package exercises2;

import java.util.Scanner;

public class Input7 {
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
		
	}
}
