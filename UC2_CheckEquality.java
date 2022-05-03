package LineComparisionProb.com;

public class UC2_CheckEquality {
	public void equalLines(double l1, double l2) {
		
		if(l1==l2) {  //(l1.equals(l2)) not working applicable for non primitive
			System.out.println("lines are equals");
		}
		else {
			System.out.println("Lines are not equals");
		}
	}
}
