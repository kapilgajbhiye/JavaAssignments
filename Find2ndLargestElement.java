//find second largest element in array
package MyAssignment_3;

public class Find2ndLargestElement {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,15};
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]<arr[j]) {
					//swap a[0]th element to a[j] 
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
			
				
			}
			
		}
		System.out.println("Second Max Element:"+arr[1]);

	}

}
