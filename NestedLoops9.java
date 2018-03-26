// Used nested for loops to find four positive integers whose sum is 45, and such that the first plus 2, the second minus 2, the third
// multiplied by 2, and the fourth divided by 2 are all equal.
// We are looking for four individual numbers, but look for as many solutions as possible. 
// 
package exercises2;

public class NestedLoops9 {
	public static void main(String[] args) {
		System.out.println("The numbers that fulfill the condition are: \n");
		for(int counter = 1;counter<45;counter++) {
			for(int counter2 =1;counter2<45;counter2++) {
				for(int counter3 = 1; counter3<45;counter3++) {
					for(int counter4 = 1;counter4<45;counter4++) {
						int num1 = counter+2;
						int num2 = counter2-2;
						int num3 = counter3*2;
						int num4 = counter4/2;
						 
						if((counter+counter2+counter3+counter4)==45 && num1==num2&&num2==num3&&num3==num4) {
						System.out.println(counter+" "+counter2+" "+counter3+" "+counter4);}
					}
				}
			}
		}
		
	}
	
}
