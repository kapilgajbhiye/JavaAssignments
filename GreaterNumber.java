package com.assignment5.practiceproblems;

public class GreaterNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		if(a>b && a>c) {
			System.out.println("A is greater"+a);
		}
		
		if(b>a && b>c) {
			System.out.println("B is greater"+b);
		}
		
		if(c>a && c>b) {
			System.out.println("C is greater: "+c);
		}
		
	}

}
