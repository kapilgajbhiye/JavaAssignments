//Java Program to print the smallest element in an array
package MyAssignment_3;

import java.util.Scanner;

public class FindSmallestElementArray {

	public static void main(String[] args) {
		
		//For taking input in array from user.
		/*Scanner sc = new Scanner(System.in);
		int[] x = new int[6];
		
		System.out.println("Enter the Elements of Array:");
		for(int i=0;i<6;i++) {
			
			x[i]=sc.nextInt();
		}*/
		
		int[] x = {12,11,34,35,54,37};
		int min=x[0];
		for(int i=1;i<x.length;i++) 
		{
			if(x[i]<min)
			{
				min=x[i];
				
			}
		}
		System.out.println(min);
	}

}
