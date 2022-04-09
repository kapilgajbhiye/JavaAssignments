package MyAssignment_3;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] x = {10,20,30,40,50,60};
		System.out.println("Original Array: "+Arrays.toString(x));
		for(int i=x.length-1;i>=0;i--) {
			System.out.println("Reverse Array:"+x[i]);
		}
			

	}

}
