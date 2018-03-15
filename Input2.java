// Ask the user for two words and two numbers, and let the person at the keyboard type in some values, just get input
// dont store any values

package exercises2;
import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Give me a word: ");
		String word1 = userin.nextLine();
		
		System.out.println("Give me a 2nd word: ");
		String word2 = userin.nextLine();
		
		System.out.println("Give me a number: ");
		int num1 = userin.nextInt();
		
		System.out.println("Give me another number: ");
		int num2 = userin.nextInt();
		
		System.out.println("GOOD JOB");
	}
}
