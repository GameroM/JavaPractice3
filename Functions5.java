// Write a function. It will return the name of a month of the year, given the month number, according to the table below. Make sure you do
// not put any input or output statements in the function; the month number will be passed in and the string containing the name will be
// returned. The function should be called month_name() and must have one parameter (an integer) and return a String.

package exercises2;

public class Functions5 {
	public static void main( String[] args ) {

    System.out.println( "Month 1: " + month_name(1) );
    System.out.println( "Month 2: " + month_name(2) );
    System.out.println( "Month 3: " + month_name(3) );
    System.out.println( "Month 4: " + month_name(4) );
    System.out.println( "Month 5: " + month_name(5) );
    System.out.println( "Month 6: " + month_name(6) );
    System.out.println( "Month 7: " + month_name(7) );
    System.out.println( "Month 8: " + month_name(8) );
    System.out.println( "Month 9: " + month_name(9) );
    System.out.println( "Month 10: " + month_name(10) );
    System.out.println( "Month 11: " + month_name(11) );
    System.out.println( "Month 12: " + month_name(12) );
    System.out.println( "Month 43: " + month_name(43) );
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
}
