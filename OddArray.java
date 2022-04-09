//Java Program to print the elements of an array present on odd position
package MyAssignment_3;

import java.util.Arrays;

public class OddArray {

	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6};
		System.out.println("Original Array: "+Arrays.toString(x));
		for(int i=0;i<x.length;i++) {

			if(x[i]%2!=0) {
			System.out.println("Even Number:"+x[i]);	
			}
			
		}

	}

}
