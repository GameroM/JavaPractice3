// Use nested for loops to generate a multiplication table, which should go all the way up to 12x9

package exercises2;

public class NestedLoops4 {
	public static void main(String[] args) {
		
		System.out.println("x | 1\t2  \t3\t4\t5\t6\t7\t8\t9");
		System.out.println("====================================================================");
		for(int counter = 1;counter<=12;counter++) {
			System.out.print(counter+"  |");
			for(int counter2 = 1;counter2<10;counter2++) {
				System.out.print(counter*counter2+"\t");}
			System.out.println();
		}
		
	}
}
