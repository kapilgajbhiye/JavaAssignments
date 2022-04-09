//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
package MyAssignment2;

import java.util.Scanner;

public class NaturalNumber {

		public static void addNaturalNumber(int num) {
			
			int i=1;
			int sum=0;
			while(i<=num) {
				
				System.out.println(i);
				
				sum = sum + i;
				i++;
			}
			System.out.println("Total:"+sum);
		}
	
	public static void main(String[] args) {
		
		System.out.println("Eenter Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		addNaturalNumber(num);
		
	}

}
