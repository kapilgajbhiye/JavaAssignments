package com.assignment5.practiceproblems;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int head_count=0;
		int tail_count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of time to flip the coin: ");
		int input = sc.nextInt();
		
		for(int i =0; i<input; i++) {
			double value =Math.random();
			if(value<0.5) {
				head_count++;
			}else {
				tail_count++;
			}
		}
		double head = head_count/ input*100;
		double tail = tail_count/ input*100;
		System.out.println("Head Percentage:"+head);
		System.out.println("Tail Percentage:"+tail);
	}
}
