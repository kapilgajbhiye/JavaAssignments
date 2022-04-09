//Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of
//month m is between
//	 March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
	
package MyAssignment2;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month)
		{
			case 1:
			System.out.println("January");
			break;
			
			case 2:
			System.out.println("February");
			break;
				
			case 3:
			System.out.println("March");
			break;
			
			case 4:
			System.out.println("April");
			break;
	
			case 5:
			System.out.println("May");
			break;
					
			case 6:
			System.out.println("June");
			break;		
			
			case 7:
			System.out.println("July");
			break;
				
			case 8:
			System.out.println("August");
			break;
					
			case 9:
			System.out.println("September");
			break;
				
			case 10:
			System.out.println("October");
			break;
		
			case 11:
			System.out.println("November");
			break;
						
			case 12:
			System.out.println("December");
			break;		
									
		
		}
		

	}

}
