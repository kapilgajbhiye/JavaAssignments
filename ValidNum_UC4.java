package com.bridgelab.in;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNum_UC4 {

	public static boolean isValid(String s) {
		//String regex = "^([789]{1})([234789]{1})([0-9]{8})$";
		String regex = "^((\\+91)?|91)?[789][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		return (m.matches());
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String s = sc.next();
		ValidNum_UC4.isValid(s);
		
		if(isValid(s)) {
			System.out.println("valid number");
		}else
			System.out.println("Invalid number");
		
	}

}
