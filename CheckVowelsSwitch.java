package com.assignment5.practiceproblems;

//Write a Program to Check Vowel or Consonant 

import java.util.Scanner;

public class CheckVowelsSwitch {

	public static void main(String[] args) {
			boolean vowel=false;
			System.out.println("Enter Character:");
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			switch(ch) 
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				vowel=true;					
			}
			if(vowel==true) {
				System.out.println(ch+": is a vowel");
			}
			else {
				if((ch>='a' && ch>='z') || (ch>='A' && ch>='Z'))
				System.out.println("is a consonant");
			}
	}

}
