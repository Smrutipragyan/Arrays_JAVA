
public class Kadens_Max_Subarray {

	public static void Kadens(int arr[])
	{
		int cs=0;
		int ms=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			cs=cs+arr[i];
			if(cs<0)
			{
				cs=0;
			}
			cs=Math.max(ms, cs);
		}
		System.out.println("The max of the sub array is : "+cs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,-4,6,9,-2,3};
		Kadens(arr);
	}

}
