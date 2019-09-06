


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

Access Modifier     within class	within package		outside of the package
--------------------------------------------------------------------------------------
    private				YES		  			 NO					NO
    default				YES		   			YES					NO
    protected			YES		   			YES					YES(through inheritance)
    public 				YES		   			YES					YES
------------------------------------------------------------------------------------------------------------------------*/
package AccessModifiers;



/*class A
{
	 private int a=10;
	private void m1()
	{
		System.out.println(a);
	}
}*/

class A
{
	  int a=10;
	 void m1()
	{
		System.out.println(a);
	}
}

public class AccessModifiersxamples {

	public static void main(String[] args) {
		
		A aobj=new A();
		/*aobj.a=30;// cannot acccess since it is private 
		aobj.m1();// cannot access since it is private
*/
		aobj.a=30;
		aobj.m1();
	}

}
