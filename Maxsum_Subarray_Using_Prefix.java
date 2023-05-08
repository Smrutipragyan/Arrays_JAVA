public class Maxsum_Subarray_Using_Prefix {
	
	public static void Largest_Sum_Subarray(int arr[]) {
		int current_sum=0;
		int max_sum= Integer.MIN_VALUE;
		int prefix[]=new int[arr.length];
		
		prefix[0]=arr[0];
		
		//calculate prefix array
		for(int i=1;i<prefix.length;i++)
		{
			prefix[i]=prefix[i-1]+arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
			 current_sum=i==0 ? prefix[j]:prefix[j]-prefix[i-1];
			 System.out.println(current_sum);
			 
			if(max_sum<current_sum)
			{
				max_sum=current_sum;
			}
				 
				}
			}
		System.out.println("The maximum sum is= "+max_sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,-4,6,9,-2,3};
		Largest_Sum_Subarray(arr);
	}

}
