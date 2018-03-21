// Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for multiples
// of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"

package exercises2;

public class ForLoops8 {
	public static void main(String[] args) {
		System.out.println("This program prints the numbers from 1 to 100, multiples of three and five or both will be marked");
		
		for(int counter = 1;counter <= 100;counter++) {
			if(counter%3 ==0 && counter % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(counter%3 == 0 && counter %5 !=0) {
				System.out.println("Fizz");
			}
			else if(counter %3 != 0 && counter %5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(counter);
			}
		}
	}
}
