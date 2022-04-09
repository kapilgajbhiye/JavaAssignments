//Write a Program to find Palindrome Number
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.
package MyAssignment2;

import java.util.Scanner;

public class PallindromeNumber {
	
		public static void checkPalindromeNumber(int num) {
			
			int num1=num;
			int rev = 0;
			for(;num !=0;) {	
				rev = (rev*10) + num%10; //num%10 calculating reminder
				num = num/10;	//shifting decimal 
			}
			if(num1==rev) {
				System.out.println("Palindrome number.");
			}else {
				System.out.println("Not a Palindrome Number.");
			}
			
		}
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		checkPalindromeNumber(num);
	}
}
