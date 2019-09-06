package Arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		//int a[][[]=new int[3][4];//fixed
		int a[][]= {{10,20,30},{50,60,83},{65,48,96},{58,58,44}};//no limit,we can add more elements when we want
		
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
