// Ask user for their name. Then display their name and askk for age and display how old they would be in 5 years and how old
// they were 5 years ago

package exercises2;

import java.util.Scanner;

public class Input5 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = userin.nextLine();
		
		System.out.print("Hello "+name+", how old are you? ");
		int age = userin.nextInt();
		
		System.out.println("So you are "+age+" years old. In that case in 5 years you \nwill be "+(age+5)+" and 5 years"
				+ " ago you were "+(age-5));
	}
}
