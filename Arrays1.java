// Create an array that can hold ten integers. Fill up each slot of the array with the number -113. Then display the contents of the array
// on the screen. Do not use a loop. Do not use any variable for the index; you must use literal numbers to refer to each slot.


package exercises2;

public class Arrays1 {
	public static void main(String[] args) {
		int array1[] = new int[10];
		array1[0]=-113;
		array1[1]=-113;
		array1[2]=-113;
		array1[3]=-113;
		array1[4]=-113;
		array1[5]=-113;
		array1[6]=-113;
		array1[7]=-113;
		array1[8]=-113;
		array1[9]=-113;
		
		System.out.println("Slot 0 contains a "+array1[0]);
		System.out.println("Slot 1 contains a "+array1[1]);
		System.out.println("Slot 2 contains a "+array1[2]);
		System.out.println("Slot 3 contains a "+array1[3]);
		System.out.println("Slot 4 contains a "+array1[4]);
		System.out.println("Slot 5 contains a "+array1[5]);
		System.out.println("Slot 6 contains a "+array1[6]);
		System.out.println("Slot 7 contains a "+array1[7]);
		System.out.println("Slot 8 contains a "+array1[8]);
		System.out.println("Slot 9 contains a "+array1[9]);
	}
}
