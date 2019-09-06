package ExceptionHandling;

public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		System.out.println("program is started");
		int i=10;
		try {
		System.out.println(i/0);//ArithmeticException
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());//  / by zero
		}
		
		String s1=null;
		try {
		System.out.println(s1.length());//NullPointerException
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());//null
		}
		
		System.out.println("program is in progress");
		System.out.println("program is completed");
	}

}
