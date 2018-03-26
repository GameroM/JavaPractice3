// Use nested for loops to generate a list of all the positive two igit numbers. Display the numbers and the sums of their digits.

package exercises2;

public class NestedLoops6 {
	public static void main(String[] args) {
		for(int i = 1;i<10;i++) {
			   for(int j= 0;j<10;j++) {
			    String fdigit = String.valueOf(i);
			    String sdigit = String.valueOf(j);
			    int suma = Integer.parseInt(fdigit)+Integer.parseInt(sdigit);

			    System.out.println(fdigit+sdigit+" "+ fdigit+" + "+sdigit+ " = "+suma);
				 
			   }
			}
	}
}
