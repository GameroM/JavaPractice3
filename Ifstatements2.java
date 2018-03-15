// Make a program which displays a different message dependeing on the age given. The possible responses are:
// less than 16, you cant drive; less than 18 you cant vote; less than 25, you cant rent a car; age is 25 or over, you can do anything legal

package exercises2;
import java.util.Scanner;

public class Ifstatements2 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Hello, how old are you? ");
		int age = userin.nextInt();
		
		if (age < 16) {
			System.out.println("You can't drive");
		}
		if(age<18) {
			System.out.println("You can't vote");
		}
		if(age<25) {
			System.out.println("You can't rent a car ");
			
		}
		if(age>=25) {
			System.out.println("You can do anything that is legal");
		}
	}
}
