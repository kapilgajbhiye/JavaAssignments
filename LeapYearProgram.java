//Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same.
package MyAssignment_1;

import java.util.Scanner;

public class LeapYearProgram {

	public static boolean CheckLeapYear(int year){
		
		if(year>=1586) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the Year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(CheckLeapYear(year) == true) {
			System.out.println("leap year");
		}
		else {
			System.out.println("Not leap year");
		}
	
	}
}


//if year is completely divisible by 400 than leap yea
/*if year is completely divisible by 400 than leap year and if year is not divisible by 100 is leap year 
ex 1992(condition_1 (number not divisible by 400) but condition_2 (divisible by 4 and not divisible by 100))*/

