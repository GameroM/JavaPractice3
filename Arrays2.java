// Create an array that can hold ten integers. Fill up each slot of the array with the number -113. Then display the contents of the array on
// the screen. This time you MUST use a loop to put the values in the array and to display them. Also, in the condition of your loop, you 
// should not count to a literal number. Instead use the length field of your array.

package exercises2;

public class Arrays2 {
	public static void main(String[] args) {
		
		int arr[]=new int[10];
		for(int counter = 0;counter <arr.length;counter++) {
			arr[counter]=-113;
			System.out.println("Slot "+counter+" contains a "+arr[counter]);
		}
	}
}
