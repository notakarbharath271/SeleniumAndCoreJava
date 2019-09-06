package OopsConcept;

public class MethodOverloding {
	
	/*Methods :
	-----------
	Method is contain a piece of code which will perform certain task.
	Method are take a parameter are may not take parameters,and returns a value are may not returns the value*/
	
	
	/*Method Overloding:
	------------------
		Method Overloding means with in same class more the one method with the same name is called MethodOverloding. 
	
	 Rules for defining the Overloding:
	 ----------------------------------
	  MethodOverloding:
	  -----------------
		Rule 1: Number of parameters
		Rule 2: Order of parameters(1-argument,2-argument---)
		Rule 3: data type of paramaters
	*/
	int a;
	int b;
	
	void sum() 						//method-1
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	// when use the same variable name to the constructor to make the difference to the calss variables to external variables the  we use this keyword concept.
	// 1`st way
	/*void sum(int x,int y) 			//method-2
	{
		a=x;
		b=y;
		System.out.println(x+y);
	}*/
	// 2`nd way
	void sum(int a,int b) 			//method-2
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	
	void sum(int x, double y)		//method-3
	{
		System.out.println(x+y);
	}
	
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);	//method-4
	}
	public static void main(String[] args) {
		// to call the methods we want create object,
		MethodOverloding mo = new MethodOverloding();
		mo.sum();				// call the method-1---> 30
		mo.sum(30, 40);			// call the method-2--->70
		mo.sum(20, 20.25);		// call the method-3--->40.25
		mo.sum(20, 50, 90);		// call the method-4---->160
		

	}

}
