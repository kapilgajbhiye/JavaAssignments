//Write a program to check two strings are equal or not 
package MyAssignment_1;
import java.util.Scanner;
public class CompairString {

	public static void main(String[] args) {
		
		System.out.println("Enter string 1:");
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		
		System.out.println("Enter string 2:");
		Scanner sc1 = new Scanner(System.in);
		String s2=sc1.next();
		
		//System.out.println("Enter string 2:");
		//String s3=sc.next();
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//System.out.println(s1==s3);
		//System.out.println(s1.equals(s3));
		
		
	}

}
