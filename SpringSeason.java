// Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between
// March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
package MyAssignment2;

import java.util.Scanner;

public class SpringSeason {
	
	public static boolean range(int m,int d) {
		
		if((m==3 && d==20)||(m==6 && d==20 )){
			return true;
		}else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		System.out.println("month:"+month);
		
		int day = sc.nextInt();
		System.out.println("day:"+day);
		

	}

}
