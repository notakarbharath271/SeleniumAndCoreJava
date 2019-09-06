
/*Checked Exception:
------------------
InterruptedException
FileNotFoundException
IOException*/
package ExceptionHandling;

public class CheckedException {

	public static void main(String[] args) {
	
		System.out.println("Programe is started");
		System.out.println("Programe is in progress");
		try {
		Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Programe is Completed");
		System.out.println("Programe is exited");
	}

}
