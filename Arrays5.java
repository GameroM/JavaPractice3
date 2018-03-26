// Write a program that creates an array of ten integers. It should put ten random numbers from 1 to 100 in the array. It should copy all the
// elements of that array into another array of the same size. Then display the contents of both arrays.

package exercises2;



import java.util.Random;

public class Arrays5 {
	public static void main(String[] args) {
		
		Random randi = new Random();
		int array1[] = new int[10];
		System.out.print("Array 1: ");
		int b[] = new int[array1.length];
		for(int counter=0;counter<array1.length;counter++) {
			int nums = 1+randi.nextInt(100);
			array1[counter] = nums;
			//if(array1[9]==array1[counter]) {
			//	array1[counter]=-7;
			//}
			System.out.print(array1[counter]+"  ");
		}
		System.out.println();
		System.out.print("Array 2: ");
		for(int counter2 = 0;counter2<array1.length;counter2++) {
				b[counter2]=array1[counter2];
				System.out.print(b[counter2]+"  ");
		
		}
		System.out.println();
		
	}
}
