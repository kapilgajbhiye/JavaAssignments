//Java Program to print the elements of an array
package MyAssignment_3;

import java.util.Arrays;

public class DisplayArrayElements {

	public static void main(String[] args) {
		int[] my_Array = {10,20,30,40,50};
		System.out.println("Original Array: "+Arrays.toString(my_Array));
		
		for(int i=0;i<my_Array.length;i++) {
			
			System.out.println("Elements of Array:"+my_Array[i]);
		}
		
		

	}

}
