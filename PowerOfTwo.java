package com.assignment5.practiceproblems;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		if(n >= 0 && n < 31 ) {
		n = (int) Math.pow(2,n);
		System.out.println("2 power "+n);
		}
		else {
			System.out.println("invalid range");
		}
	}

}
