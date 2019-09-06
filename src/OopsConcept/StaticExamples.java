


/*static keyword:

static variable :
-----------------
	static int a; 
	
	A variable which is decelared with the static keyword is called static variable.
	If the variable is common to the all object then we decelare a variable as static variable.
	if we change the value of the static variable it refect to all the object,because it comman to all the object.
	It create the seperate memory location,then it shared by every objects.
	To avoid the duplicate,reuseablity
	If declare the variable as static then we access directly by using the class name
 
static method:
--------------

	A variable which is decelared with the static keyword is called static variable.
	If the variable is common to the all object then we decelare a variable as static variable.
	It create the seperate memory location,then it shared by every objects.
	To avoid the duplicate,reuseablity
	If declare the method as static then we access directly by using the classname
	

	static void m1()//static method
	{
	//code
	}*/

	// ** static method is only access only the static stuff(direct access)
	// ** static method can also access non static stuff but through the object.
	// ** non static  method can access everything(static and non static -direct access.)

package OopsConcept;

public class StaticExamples {

	
	
	int a;
	static int b;
	
	static void m1()
	{
		System.out.println("m1 method :static");
	}
	
	void m2() 
	{
		System.out.println("m2 method :non static");
	}
	
	void m3() 
	{
		a=20;
		b=30;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) { //static method
		
		
		b=10;
		m1();
		System.out.println(StaticExamples.b);
		
		// non static we can access by only throgh object
		
		//a=10; not accessiable because it is non static  variable
		
		//m2(); not accessiable because it is non static  variable
		
		StaticExamples ns = new StaticExamples();
		int a =ns.a=300;
		System.out.println(a);
		ns.m2();
		ns.m3(); 
		

	}

}
