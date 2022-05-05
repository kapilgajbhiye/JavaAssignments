package com.bridgelab.in;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNameRegex_UC1 {
	public static boolean isValidFirstName(String name) {
		
		String regex = "^[A-Za-z]\\w{1,2}$"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		return m.matches();
	}
	
	public static void main(String args[]) {
		String s1 = "Kap";
		System.out.println(isValidFirstName(s1));
		String s2 = "Kapasd";
		System.out.println(isValidFirstName(s2));
		String s3 = "Kaps";
		System.out.println(isValidFirstName(s3));
	}
}
