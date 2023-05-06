
public class PrintPairs {

	public static void Pairs(int arr[])
	{
		int tp=0;
		for(int i=0;i<arr.length;i++)
		{
			int current=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.print("("+current+","+arr[j]+")");
				tp++;
			}
		}
		System.out.println();
		System.out.println("Total number of pairs = "+tp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		
		 
		System.out.print("The pairs are: ");
		Pairs(arr);
		 
	}

}
