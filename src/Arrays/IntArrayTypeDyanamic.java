package Arrays;

public class IntArrayTypeDyanamic {

	public static void main(String[] args) {

		int a[]= {100,20,30,252,80,9,25,945};//dyanamic array,we can add the elements,when we want
		
		System.out.println(a.length);
		int sum=0;
		
		for(int i:a) {
			System.out.println(i);
			sum=sum+i;
			System.out.println("Sum of  the array elements :"+sum);
		}


	}

}
