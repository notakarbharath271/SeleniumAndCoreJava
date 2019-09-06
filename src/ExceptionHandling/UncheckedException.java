package ExceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		
		int a=10;
		//System.out.println(a/0);//ArithmeticException
		
		String s = null;
		//System.out.println(s.length());//NullPointerException
		
		String st="abcd";
		//int i = Integer.parseInt(st);
		//System.out.println(i);//NumberFormatException
		
		int arr[]=new int[5];
		arr[10]=100;
		System.out.println(arr[10]);//ArrayIndexOutOfBoundsException 
		

	}

}
