
public class ReverseArray_BinarySearch {

	public static void Reverse(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			
			start++;
			end--;
		}
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,5,7,9};
		  
		  Reverse(arr);
		  System.out.print("Reverse array is - ");
		  for(int i=0;i<=arr.length-1;i++)
		  {
			  System.out.print(arr[i]+" ");
		  }
		   
	}

}
