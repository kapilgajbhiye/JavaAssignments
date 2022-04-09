//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5 using for loop
package MyAssignment2;

import java.util.Scanner;

public class SumNaturalNumberForLoop {
			
			public static void sumNaturalNumbers(int num) {
				 int sum=0;
				for(int i=1;i<=num;i++) {
					
					 sum = sum + i;
					System.out.println("Natural Number:"+i);
					
				}
				System.out.println("Total of Natural Number:"+sum);
			
			}
	public static void main(String[] args) {
		System.out.println("Enter the number:");	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sumNaturalNumbers(num);
		
	
		}

}
