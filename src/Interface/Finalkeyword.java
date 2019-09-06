

/*
 
	
---------------------------------------------------------------------------------------------------------
 *Final Keyword:
--------------
Final keyword is used in front of the class,variable and method.final is used when we are using interface.

final int a=10; //make the value constant through the class

final void m1() //we can not override in the child class.
{
 /////
---------------------------------------------------------------------------------------------------------
*/
package Interface;

final class Test
{
	 final int a=20;//constant variable
	 
	 final void m1()
	 {
		 //a=30; //not valid because the variable is decleared as final(constant thorough the class)
		 System.out.println(a);
	 }
	
}

/*class Test1 extends Test //The type Test1 cannot subclass the final class Test(bzc Test class make as final ,we cannot extend the parent class)
{
	//not valid
	void m1()//Cannot override the final method from Test
	{
		System.out.println("m1 is override");
	}
}*/

public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
