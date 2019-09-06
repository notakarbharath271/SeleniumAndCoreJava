
/*Access modifiers:
-----------------
	private
	default
	protected
	public
---------------------------

private : (variables,methodes) access level of private only with the class

default : access level of the default only with in the packages(every classes), out side of package not accesiable.
	 if we don`t specify access modifier it terated as default modifier.
	ex. 
	   int a=10;
	   void m1()
		{
	           }

protected: accesible with in the package and outside of the package but through inheritance.	

public:can accessible every where(within the package or out side of the package,within the class out side of the class)
------------------------------------------------------------------------------------------------------------------------*/
package package1;

public class A {
	
	/*// default:
	 	---------
	
	int a=10; //default
	
	void m1() //default
	{
		System.out.println(a);
	}*/
	
	//protected:
	//----------
	/*
		protected int a=10; 
	
		protected void m1()
			{
				System.out.println(a);
			}*/
	
	//public:method,variables accessible every were
	
			public int a=10; //default
	
			public void m1() //default
			{
				System.out.println(a);
			}
}
