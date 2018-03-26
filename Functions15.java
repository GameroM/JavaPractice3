// Write a function isEven(int n). THe function should return the value true if n is an even number and false otherwise
// Also write a fucntion isDivisibleBy3(int n) This function should return the value true if n is evenly divisible by 3 and false
// otherwise. Write a main() that contains a for loop to generate all the number from 1 to 20. Use if statements inside the loop to 
// mark the number with a "<" if its even, wit a "=" if its diviisble by 3 and with both if it is divisilbe by both 2 and 3

package exercises2;


public class Functions15 {
	public static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isDivisibleby3(int n) {
		if(n% 3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		for(int counter = 1; counter <21;counter++) {
			//System.out.print(counter);
			if(isEven(counter)==true && isDivisibleby3(counter)==true) {
				System.out.println(counter+"<=");
			}
			else if(isEven(counter)==true) {
				System.out.println(counter+"<");
			}
			else if(isDivisibleby3(counter)==true) {
				System.out.println(counter+"=");
			}
			else {
				System.out.println(counter);
			}
		}
		
	}
}
