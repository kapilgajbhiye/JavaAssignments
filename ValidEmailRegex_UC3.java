package com.bridgelab.in;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailRegex_UC3 {

	public static boolean validEmain(String email) {
		
		String regex ="^[a-z0-9]+[-/+.]*[0-9a-z]*@[a-z0-9]+.[a-z]{2,6}.[a-z]*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
		
	}
	
	public static void main(String[] args) {
		
		String email = "dsdkapil@gmail.com";
		System.out.println(validEmain(email));
		
		String email1 = "dsdkapil@";
		System.out.println(validEmain(email1));
		
		String email2 = "@gmail.com";
		System.out.println(validEmain(email2));
		
		
	}	
		
}
