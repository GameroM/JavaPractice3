// Using functions we previously created from other files.

package exercises2;

import java.util.Scanner;

public class Functions14 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("This program will tell you what day of the week \nyou were born according to your birth date");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();
		
		System.out.println("Now it is your turn!!");
		System.out.println("Birth date (mm dd yyyy)");
		int mm = userin.nextInt();
		int dd = userin.nextInt();
		int yyyy = userin.nextInt();
		System.out.println("You were born on "+weekday(mm,dd,yyyy));
		Functions5.month_name(mm);
		Ifstatements4.weekday_name(dd);
		Functions6.month_offset(mm);
		Functions7.is_leap(yyyy);
		
	}
	public static String weekday(int mm,int dd, int yyyy) {
		int yy,total;
		String date = "";
		
		yy =yyyy-1900;
		total = yy/4;
		total+=yy;
		total+=dd;
		total+=Functions6.month_offset(mm);
		if(Functions7.is_leap(yyyy)==true && (Functions5.month_name(mm)=="January"||Functions5.month_name(mm)=="February")) {
			total-=1;
		}
		int remainder = total%7;
		//weekday_name(remainder);
		
		date = Ifstatements4.weekday_name(remainder)+", "+Functions5.month_name(mm)+", "+dd+", "+yyyy;
		return date;
		
	}
	
}
