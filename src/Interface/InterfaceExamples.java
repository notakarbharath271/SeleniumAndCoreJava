

/*interface:
----------

 Interface contains only static and final variables,abstrsct methods.
---------------------------------------------------------------------
   1.Interface is a blueprint of class
interface TestInt
{
//variables
//methods
}
  2. interface contains only static and final variables (by default)
  3. in interface by default methods are public.
  4. i interface methods are by default abstract
 
abstract: amethod has only defination but no implementation.
	abstract void m1();

interface TestInt
{
  void m1(); //abstract method
}

class TestClass implements TestInt
{
 @ overrid
 public void m1()
   {
      /////implement the body
   }
}


  5.we cannot instatiate interface
  
	TestInt testobj = new TestInt();//not valid //interface name
	
	TestClass  testobj = new TestClass ();//valid  //class class
	----------------------------------------------------------------------------------
	*/
package Interface;

interface TestInt
{
	int a=10; //by default variable is static and final
	
	void display();//Abstract methods do not specify a body
	
}



public class InterfaceExamples implements TestInt

{
public void display() {
		
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
		// TestInt obj = new TestInt();//Cannot instantiate the type TestInt
		InterfaceExamples obj = new InterfaceExamples();
		
		obj.display();


	}

	
}
