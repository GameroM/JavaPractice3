// Using the previous functions you completed, wreite a function to etermine the day of the week a person was born given his or her birthday
// The following steps should be used to find the day of the week corresponding to any date from 1901 through the present

// Type birthday as: "6 10 1981" month,day,year
// Find the number of years since 1900, and put it into variable yy. Simply subtract 1900 from the year to get this.
// Divide the number of years since 1900 by 4. Put the quotient in a variable called total. For ex, if the person was born in 1983, divide
// 83 by 4 and store 20 in total.
// Also add the number of years since 1900 to total.
// Add the day of the month to total
// Using the function month_offset() you wrote, find the month offset and add it to total
// If the year is a leap year and if the month you are working with is either January or February,then subtract 1 from total
// Find the remainder when total is divided by 7. Pass this remainder to the function weekday_name() you wrote to determine the day of the week
// the person was born
// Finally build a single String value containing the whole date(day of week, month, day, year). You will need to use the funciton month_name
// you wrote to show the month name rather than its number.
// Return that string value

package exercises2;

import java.util.Scanner;

public class Functions7 {
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
	
		
	}
	public static String weekday(int mm,int dd, int yyyy) {
		int yy,total;
		String date = "";
		
		yy =yyyy-1900;
		total = yy/4;
		total+=yy;
		total+=dd;
		total+=month_offset(mm);
		if(is_leap(yyyy)==true && (month_name(mm)=="January"||month_name(mm)=="February")) {
			total-=1;
		}
		int remainder = total%7;
		//weekday_name(remainder);
		
		date = weekday_name(remainder)+", "+month_name(mm)+", "+dd+", "+yyyy;
		return date;
		
	}
	public static int month_offset(int month) {
		int result=0;
		if(month == 1) {
			result = 1;
		}
		else if(month ==2) {
			result = 4;
		}
		else if(month ==3) {
			result = 4;
		}
		else if(month ==4) {
			result = 0;
		}
		else if(month ==5) {
			result = 2;
		}
		else if(month ==6) {
			result = 5;
		}
		else if(month ==7) {
			result = 0;
		}
		else if(month ==8) {
			result = 3;
		}
		else if(month ==9) {
			result = 6;
		}
		else if(month ==10) {
			result = 1;
		}
		else if(month ==11) {
			result = 4;
		}
		else if(month ==12) {
			result = 6;
		}else {
			result = -1;
		}
		
		return result;
		
	}
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
	public static String month_name(int x) {
		String name ="";
		if(x==1) {
			name = "January";
		}
		else if(x==2) {
			name = "February";
		}
		else if(x==3) {
			name = "March";
		}
		else if(x==4) {
			name = "April";
		}
		else if(x==5) {
			name = "May";
		}
		else if(x==6) {
			name = "June";
		}
		else if(x==7) {
			name = "July";
		}
		else if(x==8) {
			name = "August";
		}
		else if(x==9) {
			name = "September";
		}
		else if(x==10) {
			name = "October";
		}
		else if(x==11) {
			name = "November";
		}
		else if(x==12) {
			name = "December";
		}else {
			name = "error";
		}
		
		return name;
	}
	public static String weekday_name( int weekday )
	{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 )
		{
			result = "Saturday";
		}
		else if ( weekday == 0 )
		{
			result = "Saturday";
		}
		else {
			result = "error";
		}
		return result;
	}
}
