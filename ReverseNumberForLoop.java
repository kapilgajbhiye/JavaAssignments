package MyAssignment2;

import java.util.Scanner;

public class ReverseNumberForLoop {

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1=num;
		int rev=0;
		
		for(int i=num;i>0;i=i/10) 
		{
			
			rev =  (rev*10) + i%10 ;
		}
		System.out.println("Original Number: "+num1);
		System.out.println("Reversed Number: "+rev);
	
	
	}
}



