package LineComparisionProb.com;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		
		UC1_CalculateLength len = new  UC1_CalculateLength();
		double l1 = len.calLength(2, 4, 6, 8);
		double l2 = len.calLength(10, 6, 14, 16);
		System.out.println("length one: "+l1);
		System.out.println("length two: "+l2);
		
		UC2_CheckEquality eql = new UC2_CheckEquality();
	    eql.equalLines(l1, l2);
		
	    UC3_CompairLines com = new UC3_CompairLines();
	    com.checkLineComparision(l1,l2);
	    
	}
}
