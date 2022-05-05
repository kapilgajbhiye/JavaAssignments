package com.bridgelab.in;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNameRegex_UC2 {
	public static boolean isValidFirstName(String fName) {
		
		String regex = "^[A-Za-z]\\w{1,2}$"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fName);
		return m.matches();
	}
	
	public static boolean isValidLastName(String lName) {
		
		String regex = "^[A-Za-z]\\w{1,2}$"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lName);
		return m.matches();
	
		
	}
	
	public static void main(String args[]) {
		
		String s1 = "Kap";
		System.out.println(isValidFirstName(s1));
		String s2 = "Kapasd";
		System.out.println(isValidFirstName(s2));
		
		String s3 = "Gaj";
		System.out.println(isValidLastName(s3));
		
		String s4 = "Gajbhiye";
		System.out.println(isValidLastName(s4));
		
	}
}
