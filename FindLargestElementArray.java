//Java Program to print the largest element in an array
package MyAssignment_3;

import java.util.Scanner;

public class FindLargestElementArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max=arr[0];
		for(int i=0;i<5;i++ )
		{
			System.out.println("Enter the Elements of array: ");
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}System.out.println("Max Element:"+max);
		
	}

}
