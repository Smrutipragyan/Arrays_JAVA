
public class LargestNum_Array {

	public static int LargestNum(int arr[] )
	{
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				  largest=arr[i];
			}
			 
	    }
		return largest;
	}
		public static int SmallestNum(int arr[]) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				  smallest=arr[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,25,80,45,68,39};
		System.out.println(LargestNum(arr));
		System.out.println(SmallestNum(arr));
	
	}

}
