public class Total_Subarrays {
public static void Subarrays(int arr[])
	{
		int ts=0;
		 
		for(int i=0;i<arr.length;i++) {
			//int start=i;
		 
		for(int j=i;j<arr.length;j++) {
			//int end=j;
			
			for(int k=i;k<=j;k++)        //int k=start;k<=end;k++
			{
			System.out.print( arr[k]+" ");
			}
			ts++;
			System.out.println();
			}
		System.out.println();
		}
		System.out.println("Total subarrays: "+ts);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};   
		//Total no of subarr= n*(n+1)/2
		Subarrays(arr);
	}

}
