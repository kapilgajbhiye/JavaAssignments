package MyAssignment_3;

public class SortArrayAscendingOrder {

	public static void myfunc(int[] x) {
		for(int i =0;i<x.length;i++) {
			System.out.println(x[i]);
		 }
		 
	}
	public static void main(String[] args) {
			
		
		int[] x = {1,3,5,2,4,7,9,6};
		//sort
		for(int i =0;i<x.length-1;i++) {
			for(int j=0;j<x.length-i-1;j++) {
				if(x[j]>x[j+1]) {
					//swap
					int	temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		myfunc(x);
	}

}
