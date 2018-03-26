// Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60 and whose difference is 14

package exercises2;

public class NestedLoops5 {
	public static void main(String[] args) {
		
		
		for(int counter= 1;counter<61;counter++) {
			for(int counter2 = 1; counter2<61;counter2++)
			if(counter+counter2==60 && counter-counter2==14) {
				System.out.println(counter+" " +counter2);
			}
		}
	}
}
