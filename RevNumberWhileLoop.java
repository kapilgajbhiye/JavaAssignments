//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package MyAssignment2;

import java.util.Scanner;

public class RevNumberWhileLoop {
		public static void reversNumber(int num) {
			int rev=0;
			while(num>0) {
				
				rev=(rev*10)+num%10;
				num = num/10;			
			}
			System.out.println(rev);			
		}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		reversNumber(num);

	}

}
