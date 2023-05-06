
public class Binary_Search_1 {

	public static int BinarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		 
		while(start<=end)
		{
			
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]>=target){
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,15,20,38,49,56,66};
		int  target=38;
		
		System.out.println(BinarySearch(arr,target));
	}

}
