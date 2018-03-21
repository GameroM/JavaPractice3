// Write a program to calculate the area of four different geometric shapes: triangles, squares, rectangles, and circles.
// Your program should present a menu for the user to choose which shape to calculate, then ask them for the appropriate values
//(lenght, width, radius, etc). It should pass those values to the appropriate function and display the resulting area.
// All input and output should be in the main()

package exercises2;

import java.util.Scanner;

public class Functions8 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Time to calculate areas:");
		System.out.println("=================");
		int userpick;
		do {
		//System.out.println("Please select and option:\n");
		System.out.println("1) Triangle\n2) Rectangle\n3) Square\n4) Circle\n5) Quit");
		System.out.print(">>");
		userpick = userin.nextInt();
		
		
		if(userpick == 1) {
			System.out.println("You have picked the triangle. ");
			System.out.print("Enter base: ");
			int b = userin.nextInt();
			System.out.print("Enter height: ");
			int h = userin.nextInt();
			System.out.println("The area is: "+area_triangle(b,h));
		}
		else if(userpick==2) {
			System.out.println("You have picked the rectangle. ");
			System.out.print("Enter length: ");
			int l = userin.nextInt();
			System.out.print("Enter width: ");
			int w = userin.nextInt();
			System.out.println("The area is: "+area_rectangle(l,w));
		}
		else if(userpick == 3) {
			System.out.println("You have picked the square. ");
			System.out.print("Enter one side: ");
			int s = userin.nextInt();
			System.out.println("The area is: "+area_square(s));
		}
		else if(userpick == 4) {
			System.out.println("You have pickdd the circle. ");
			System.out.print("Enter the radius: ");
			int r = userin.nextInt();
			System.out.println("The area is: "+area_circle(r));
		}
		System.out.println("======================");
		}while(userpick!=5);
		System.out.println("Goodbye");
		
	}
	public static double area_circle(int radius) {
		double acirc = Math.PI*(Math.pow(radius, 2));
		return acirc;
	}
	public static int area_rectangle(int length, int width) {
		int arec = length*width;
		return arec;
	}
	public static int area_square(int side) {
		int asqua = side*side;
		return asqua;
	}
	public static double area_triangle(int base, int height) {
		double atri=0.5*base*height;
		return atri;
	}
	
}

