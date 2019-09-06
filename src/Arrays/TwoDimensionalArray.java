package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int a[][] = new int[3][2];
		
		a[0][0]=2;
		a[0][1]=6;
		
		a[1][0]=3;
		a[1][1]=8;
		 
		a[2][0]=9;
		a[2][1]=2;
		
		//System.out.println(a.length);
	/*	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(a[i][j]);
			}*/
		
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
