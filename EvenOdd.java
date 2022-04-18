package com.assignment5.practiceproblems;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			if(i%2==0) {
				System.out.println("Even Number:"+i);
			}
			else {
				System.out.println("Odd Number:"+i);
			}
		}

	}

}
