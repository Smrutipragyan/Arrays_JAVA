
public class LargestSum_Subarray {

	public static void Largest_Sum_Subarray(int arr[]) {
		int current_sum=0;
		int max_sum= Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
			current_sum=0;
			for(int k=i;k<=j;k++)
			{
				current_sum+=arr[k];
			}
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
