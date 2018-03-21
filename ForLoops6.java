// Write another program that uses a for loop. With the loop, make the variable go from -10 to 10 counting by 0.5
// Insie the body of the loop, make another variable y become the current value of x squared. Then display the current values of both x
// and y.

package exercises2;


public class ForLoops6 {
	public static void main(String[] args) {
		System.out.println("We will count from -10 to 10 and get the values of each number squared");
		
		System.out.println("x\ty");
		System.out.println("------------");
		for(double counter = -10;counter<=10;counter+=0.5) {
			System.out.println(counter+"\t"+Math.pow(counter, 2));
		}
	}
}
