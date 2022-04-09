// Write a program to display any message ?
package MyAssignment_1;
import java.util.Scanner;

public class DisplayMessage {

	public static void main(String[] args) {
		
		System.out.println("Hello Java ");//Display message using print function
		
		
		//Dispay msg using user input
		System.out.println("Enter Message: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Display message: "+s);
		
		
	}

}
