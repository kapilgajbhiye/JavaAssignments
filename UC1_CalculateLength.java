package LineComparisionProb.com;

public class UC1_CalculateLength {
	
	public double calLength(int x1, int x2, int y1, int y2) {
		double callen = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return callen;
	}
	
}
	