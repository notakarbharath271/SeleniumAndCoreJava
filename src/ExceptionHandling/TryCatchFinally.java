
/*Exception-----> super class
	ArithmeticException
	NullPointerEception
	NumberFormatException
	ArrayIndexOutifBoundException

Handling Exception:
-------------------

there are two methods to handle exception:
------------------------------------------
   1.try..catch block(used both checked and unchecked exception)&try..catch blocked is applied at statement level.
   2.throws keyword(used to handle only checked exception ) & applied at method level not statement level.
   
   
   		   Unchecked    Checked	 Method Level	Statement Level
try..catch	    YES	       YES	       NO	        YES
throw	         NO	       YES	       YES	         NO



   >>----> try..catch blocked is applied at statement level.

>>----->  try catch block is used to handle the checked and unchecked Exception.

try
{
//specify the ststement which casuses the exception
}
catch(Exception e)
{
//write the code
}
finally
{
//code
}

finally block:
	if the data base not connected,to recover the data base or to connect the other data base we write the code the in the finally block.
	
1.Exception occurs,catch block handles,finally block also execute.
2.Exception occurs,catch block not handle,finally block execute.
3.Exception not occurs,catch block will ignore,finally block execute.*/
package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
	
		//1.Exception occurs,catch block handles,finally block also execute.
		
		/*try {
			
		arr[10]=100;
		System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
		}*/
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}*/
		
		//2.Exception occurs,catch block not handle,finally block execute.
		/*catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}*/
		
		
		//3.Exception not occurs,catch block will ignore,finally block execute.
		
		
		try {
			arr[4]=100;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("this the finally block");
		}
	}

}
