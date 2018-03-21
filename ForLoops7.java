// Write a program that uses a for loop to display all the numbers from 1 to 20, marking those which are even(divisible by two).

package exercises2;


public class ForLoops7 {

	public static void main(String[] args) {
		System.out.println("This program will mark all the numbers that are even");
		
		for(int counter = 1;counter<=20;counter++) {
			
			if(counter%2 == 0) {
				System.out.println(counter+" >>>> this number is even");
			}
			else {
				System.out.println(counter);
			}
		}
	}
}
