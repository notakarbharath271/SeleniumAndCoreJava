package Arrays;

public class ObjectArray {

	public static void main(String[] args) {

		/*	Object obj[] = new Object[5];
		
		 obj[0]="Arumugm";
		 obj[1]='A';
		 obj[2]=25;
		 obj[3]=true;
		 obj[4]=25.25;*/
		
		Object obj[]= {'a',100,"Welcome",10.25,'A'};
		 
		 for(Object obj1 :obj) {
			 System.out.println(obj1);
		 }
	}

}
