package com.assignment5.practiceproblems;

import java.util.Scanner;

	public class HarmonicNumber
	{
		public static double value(double num)
		{			
	        double sum = 0.0;

			for (int i = 1; i <= num; i++) 
			{
				sum += 1.0 / i;
			}
		return sum;
		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
		   	System.out.println("Enter a number: ");
			double num = sc.nextInt();
	    	double total = value(num);
			
			if(num>0)
		 	{
				System.out.println("The Harmonic Value: "+total);
		 	}
			else
			{
				System.out.println("Invalid number.");
			}
		}
	}

