
public class Occurance_of_Number {

	public static boolean Accuorance(int arr[])
	{
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
			 
			 
	}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,1,1,3,3,2,3,1};
		System.out.println(Accuorance(arr)); 
	}

}
