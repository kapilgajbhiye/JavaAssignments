package MyAssignment_3;

import java.util.Arrays;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int[] x = {10,20,34,23,45,45,10};
		System.out.println("Original Array: "+Arrays.toString(x));
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j] && i != j) {
					System.out.println("duplicate Element: "+x[i]);
				}
			}
		}

	}

}
