// Write a function boolean isPrime(int n). The function should return the value true if n is a prime and false otherwise.
// Rembmer that a number is prime if it isnt evenly dibislbe by anything except for 1 and itself. You can do this by using a for loop
// inside the ufncion. Make the for loop run through all the numbers from 2 up to n. Inside the loop, use and if statement that determines
// if n is evenly divisible by your loop control variable. If you find any number which divides it evenly, you can go ahead and return false
// from the function without finishing the loop. If the loop finishes and doesnt find any numbers which divide it,then return true from 
// the function. After you finishi writing the function write a main() that contains another for loop. Have it print out all the numbers from 
// 2 to 20, and mark each prime number with a "<"

package exercises2;

public class Functions16 {
	public static boolean isPrime(int n) {
		for(int counter = 2; counter<n;counter++) {
			if(n%counter == 0) {
				return false;	
			}	
		}return true;
			
	}
	public static void main(String[] args) {
		for(int counter = 2;counter<=20;counter++) {
			if(isPrime(counter)==true) {
				System.out.println(counter+"<");
			}else {System.out.println(counter);}
		}
	}
	
}
