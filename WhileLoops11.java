// Collatz Sequence-- Take any natural number n. If n is even, divide it by 2 to get n/2. If n is odd, multiply by 3 and add 1 to get 3n+1.
// Repeat the process indefinetly.
// The end result should be that the sequence will eventually rreach 1. 

package exercises2;

import java.util.Scanner;

public class WhileLoops11 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Starting number: ");
		int startnum = userin.nextInt();
		System.out.print(startnum+"\t");
		int counter = 0;
		
		if(startnum != 1) {
			do {
				if(startnum %2 == 0) {
					startnum = startnum/2;
				}
				else if(startnum %2 != 0) {
					startnum = (startnum*3)+1;
				}
				System.out.print(startnum+"\t");
				counter++;
				
			}while(startnum != 1);
		}
		System.out.println();
		System.out.println();
		System.out.println("Terminated after "+counter+" steps");
	}
}
