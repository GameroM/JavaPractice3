// Edit the given program so that it runs.

package exercises2;

public class Functions10
{
	public static void main( String[] args )
	{
		// Fill in the function calls where appropriate.

		System.out.println("Watch as we demonstrate functions.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = '!';
		
		System.out.print("The character is: ");
		randchar();

		System.out.println();
		System.out.println("\nNow let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		counter(begin,end);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x = 99;
		x = -10;
		
		System.out.println("|" + x + "| = " + abso(x) );

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		credits();
	}


	public static void credits()
	{
		
		System.out.println();
		System.out.println("programmed by Graham Mitchell");
		System.out.println("modified by Mario Alberto Gamero Perez");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  \nDo with it as you wish.");
		
	}




	public static void randchar()

	{
		// chooses a random character in the range "A" to "Z"
		int numval;
		char charval;

		// pick a random number from 0 to 25
		numval = (int)(Math.random()*26);
		// now add that offset to the value of the letter 'A'
		charval = (char) ('A' + numval);
		System.out.print(charval);

	}




	public static int counter(int start, int stop )
	{
		// counts from start to stop by ones
		int ctr;

		ctr = start;
		while ( ctr <= stop )
		{
			System.out.print(ctr + " ");
			ctr = ctr+1;
		}

		return ctr;
	}



	public static int abso(int value)
	
	{
		// finds the absolute value of the parameter
		int absval;

		if ( value < 0 )
			absval = -value;
		else
			absval = value;

		return absval;
	}


}
