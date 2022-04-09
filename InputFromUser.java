//To get the name using the command line
package MyAssignment_1;
import java.util.Scanner;
public class InputFromUser {

	public static void main(String[] args) {
		
		System.out.println("Enter the Name:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Name is:"+s);
	}

}
