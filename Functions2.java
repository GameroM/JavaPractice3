package exercises2;

import java.util.Random;

public class Functions2
{
	public static void main( String[] args )
	{
		Random rng = new Random();
		int r;
		
		for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			
			if(r==1) {
				first();
			}
			else if(r==2) {
				second();
			}
			else if(r==3) {
				third();
			}
			else if(r==4) {
				fourth();
			}
			else if(r==5) {
				fifth();
			}
			else {System.out.println("The wasnt one of the options");}

			// Optional: after the if statements are over, add in a slight delay.
		}

		System.out.println("I pledge allegiance to the flag.");
		
	}

	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
}