package com.bridgelab.in;

import java.util.regex.*;
class PassRule1_UC5 {

	public static boolean isValidPassword(String password)
	{
		String regex = "^(?=.*[0-9])"
					+ "(?=.*[a-z])(?=.*[A-Z])"
					+ "(?=.*[@#$%^&+=])"
					+ "(?=\\S+$).{8,20}$";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return m.matches();
	}

	
	public static void main(String args[])
	{

		
		String str1 = "Geeks@portal20";
		System.out.println(isValidPassword(str1));

		
		String str2 = "Geeksforgeeks";
		System.out.println(isValidPassword(str2));

		
	}
}
