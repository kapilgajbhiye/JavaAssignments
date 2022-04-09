//Read a Number 1,10,100,1000 and display unit, ten hundred
package MyAssignment2;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int thousand =0;
		int hundred = 0;
		int tens = 0;
		int ones = 0;
		
		
		
		System.out.println("Enter 4 digit number: ");
		int number = input.nextInt();
		
		
		if(number <= 9999 && number > 0) {
		
		thousand = number/1000;
		System.out.println("Thousand place digit: "+thousand);
		
		hundred =(number - (thousand*1000))/100;//(number/100)%10;
		System.out.println("hundred place digit: "+hundred);
		
		tens =(number - (hundred*100)-(thousand*1000))/10;
		System.out.println("tens place digit: "+tens);
		
		ones = (number - (tens*10) - (hundred*100)-(thousand*1000));
		System.out.println("one place digit: "+ones);
	}	
		else 
		{
			System.out.println("Enter valid number.");
			
		}
				
	}
	
}
