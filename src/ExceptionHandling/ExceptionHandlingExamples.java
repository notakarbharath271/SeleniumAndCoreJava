/*Exception Handling:
-------------------
	Exception is a event which will terminate program uexpepectedly
 2 types of exceptions:
-----------------------
	1.checked Exception :Exception which are identified by the java complier.
		ex: IOException,FileNotFoundException,Thread.Sleep etc...
	2.Unchecked Exception :Exception which are not identified by the java complier.
		ex: ArithmeticException,NullPointerEception,NumberFormatException,ArrayIndexOutifBoundException etc...*/

package ExceptionHandling;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		
		System.out.println("Started");
		
		//1.checked Exception :Exception which are identified by the java complier.(during design time)
		//programatically and syntaxically correct,this type of exception is checked excption,this type of exception identified by java compiler.
		//Thread.sleep(2000); //InterruptedException
		
		//2.Unchecked Exception :Exception which are not identified by the java complier.
		int i=10;
		System.out.println(i/0);//java.lang.ArithmeticException(exception identified during runtime)
		 
		System.out.println("Stop");
		

	}

}
