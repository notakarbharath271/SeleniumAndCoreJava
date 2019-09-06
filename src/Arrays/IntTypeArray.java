package Arrays;

public class IntTypeArray {
	
	//Array is the set of elements which contain ssame data type

	public static void main(String[] args) {
		int a[] = new int[5];//single dimensional array
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;
		 System.out.println("Size of array : "+a.length);
		 
		 System.out.println(a[4]);
		/* 
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		 }
		*/
		 
		 //for each loop
		 for(int i:a) {
			 System.out.println(i);
		 }

	}

}
