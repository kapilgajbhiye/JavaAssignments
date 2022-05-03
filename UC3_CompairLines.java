package LineComparisionProb.com;

public class UC3_CompairLines {
	public void checkLineComparision(Double l1, Double l2)
    {
        int compare = (int)l1.compareTo(l2);
        if ( compare < 0 ){
            System.out.println("len 1 is less than len 2");
        }
        else if ( compare > 0 ){
            System.out.println("len 1 is greater than len 2");
        }
        else {
            System.out.println("len 1 is equal than len 2");
        }
    }
}
