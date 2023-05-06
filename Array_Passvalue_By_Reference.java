
public class Array_Passvalue_By_Reference {

	public static void update(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			 marks[i]=marks[i]+5;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[]= {90,80,70};
		update(marks);
		
		for(int i=0;i<marks.length;i++) {
			  System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

}
