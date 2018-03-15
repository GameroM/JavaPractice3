// Write a program that compares several Strings using the compareTo() method. You should display the Strings and display the integer
// that comparteTo() gives you.
// You must have 5 examples which result in a number less than 0, five examples which result in a number greater than 0, and two examples
// which give you excatly 0. 12 examples total

package exercises2;

public class Ifstatements14 {
	public static void main(String[] args) {
		System.out.println("Positives: ");
		System.out.print("comparing 'dog' with 'cat' produces ");
		System.out.println("dog".compareTo("cat"));
		
		System.out.print("comparing 'door' with 'computer' produces ");
		System.out.println("door".compareTo("computer"));
		
		System.out.print("comparing 'schizophrenia' with 'mouse' produces ");
		System.out.println("schizophrenia".compareTo("mouse"));
		
		System.out.print("comparing 'lobster' with 'bat' produces ");
		System.out.println("lobster".compareTo("bat"));
		
		System.out.print("comparing 'toothbrush' with 'race' produces ");
		System.out.println("toothbrush".compareTo("race"));
		System.out.println("Negatives:");
		
		System.out.print("comparing 'loudspeaker' with 'spoon' produces ");
		System.out.println("loudspeaker".compareTo("spoon"));
		
		System.out.print("comparing 'frog' with 'horse' produces ");
		System.out.println("frog".compareTo("horse"));
		
		System.out.print("comparing 'apple' with 'psychology' produces ");
		System.out.println("apple".compareTo("psychology"));
		
		System.out.print("comparing 'kitty' with 'zoo' produces ");
		System.out.println("kitty".compareTo("zoo"));
		
		System.out.print("comparing 'vase' with 'cup' produces ");
		System.out.println("cup".compareTo("vase"));
		System.out.println("Zeros: ");
		
		System.out.print("comparing 'dog' with 'cat' produces ");
		System.out.println("hot".compareTo("memory"));
		
		System.out.print("comparing 'dog' with 'cat' produces ");
		System.out.println("dog".compareTo("cat"));
	}
}
