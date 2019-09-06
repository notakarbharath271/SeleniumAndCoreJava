
/*2.throws keyword(used to handle only checked exception)
 * throws is applied at method level not statement level
 * 
 * void m1() throws InterruptedException
	{
		Thread.sleep(5000);
	}*/
package ExceptionHandling;

public class Throws {
	
	void m1() throws InterruptedException
	{
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Programe is started");
		System.out.println("Programe is in progress");
		
		Thread.sleep(4000);
		
		System.out.println("Programe is Completed");
		System.out.println("Programe is exited");
		
		

	}

}
