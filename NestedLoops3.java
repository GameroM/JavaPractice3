// Use nested for loops to generate all possible coordinates from (0,0) up to (5,5)
// Make it appear in 5 rows of 5 columns

package exercises2;

public class NestedLoops3 {
	public static void main(String[] args) {
		
		for(int counter =0;counter<6;counter++) {
			for(int counter2 = 0;counter2<6;counter2++)
				 {	
				System.out.print("("+counter+","+counter2+")");
				
		}
			System.out.println();
	}
}
}
