
package exercises2;

import java.util.Scanner;

public class WhileLoops4
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.println("How many times would you like to display said message");
		int times = keyboard.nextInt();

		int n = 0;
		while ( n < times*10 )
		{
			System.out.println( (n+10) + ". " + message );
			n+=10;
		}

	}
}