// Use nested for loops to find all the three digit Armstrong numbers. Armstrong numbers are three digit numbers such that the sum
// of the digits cubed is equal to the number itself
// For example, 153 is an armstrong number because 1^3 + 5^3 + 3^3 = 153

package exercises2;

public class NestedLoops8 {
	public static void main(String[] args) {
		System.out.println("The armstrong numbers are: \n");
		for(int counter = 1;counter<10;counter++) {
			for(int counter2 = 0;counter2<10;counter2++) {
				for(int counter3 = 0;counter3<10;counter3++) {
					String fdigit = String.valueOf(counter);
					String sdigit = String.valueOf(counter2);
					String thdigit = String.valueOf(counter3);
					double num = Integer.parseInt(fdigit+sdigit+thdigit);
					double armstrong = Math.pow(Integer.parseInt(fdigit), 3)+Math.pow(Integer.parseInt(sdigit), 3)+
							Math.pow(Integer.parseInt(thdigit), 3);
					if(num==armstrong) {
						System.out.println(num);
					}
				}
				
			}
			
		}
		
	}
}
