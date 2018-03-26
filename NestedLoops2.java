package exercises2;

import java.util.Scanner;

public class NestedLoops2
{
	public static void main( String[] args ) throws Exception
	{
		Scanner userin = new Scanner(System.in);
		
		System.out.print("Please choose the base you want to work with (0-2): ");
		int userbase = userin.nextInt();
		for ( int thous=0; thous<userbase; thous++ )
		
			for ( int hund=0; hund<userbase; hund++ )
			
				for ( int tens=0; tens<userbase; tens++ )
				
					for ( int ones=0; ones<userbase; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(10);
					}
				
			
		

		System.out.println();
	}
}