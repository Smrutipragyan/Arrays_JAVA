import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10];
		System.out.println("Math: ");
		arr[0]=sc.nextInt();
		System.out.println("Phy: ");
		arr[1]=sc.nextInt();
		System.out.println("Chem: ");
		arr[2]=sc.nextInt();
		
		arr[1]=arr[1]+5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
