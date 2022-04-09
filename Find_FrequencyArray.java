//Java Program to find the frequency of each element in the array
package MyAssignment_3;

import java.util.Scanner;

public class Find_FrequencyArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the Elements of Array:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Number to Find frequency:");
		int freq = sc.nextInt();
		
		int count = 0;	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==freq) {
				count = count+1;
			}			
		}
		System.out.println("frequency of Array elemetns: "+count);
	}

}
