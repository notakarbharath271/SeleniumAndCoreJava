

	/*Constructor :
	---------------
	   Constructor is used to assining the class variables.
	
	1- Constructor is the special kind of method
	2- Constructor name should be the same as class name
	3- Constructor will not return any value
	4- Constructor will be invoked at the time of object creation(we no need to call the constructor explicitley)
	5- Constructor will take the parameter (just like method)
	6- Constructor is used for initilize the value.
	
	we have to types of constructors
	1) Default Constructor 
	2) parameterized Constructor 
	
	
	ConstructorOverloding: A class contain more then one constructor is called ConstructorOverloding.
		
		Rule 1: Number of parameters
		Rule 2: Order of parameters
		Rule 3: data type of paramaters
		
		
*/

package OopsConcept;

public class ConstructorOverloding {
	int a=0;
	int b=0;
	double c=0;
	
	//Constructors

	ConstructorOverloding()					//first Constructors
	{
		a=20;
		b=30;
		c=20.5;
	}
	
	
	// when use the same variable name to the constructor to make the difference to the calss variables to external variables the  we use this keyword concept.
	//1` way
	ConstructorOverloding(int a,int b)	//second Constructors
	{
		this.a=a;
		this.b=b;
	}
	//2` way decleare the variable name with different i.e x,y
	/*ConstructorOverloding(int x,int y)	//second Constructors
	{
		a=x;
		b=y;
	}
	*/
	ConstructorOverloding(int x,double y) // third Constructors
	{
		a=x;
		c=y;
		
	}
	ConstructorOverloding(int x,int y,double z) //fourth Constructors
	{
		a=x;
		b=y;
		c=z;
	}
	
	ConstructorOverloding(int x,double y,int z) //fifth Constructors
	{
		a=x;
		b=z;
		c=y;
	}
	
	// method
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

		public static void main(String[] args) {
			
			//ConstructorOverloding co =new ConstructorOverloding();  //first
			
			//ConstructorOverloding co =new ConstructorOverloding(20,50);  //second
			
			//ConstructorOverloding co =new ConstructorOverloding(20,20.5);	// third
			
			//ConstructorOverloding co =new ConstructorOverloding(20,80,35.25); //fourth
			
			ConstructorOverloding co =new ConstructorOverloding(20,65.21,25); //fifth
			co.display();
			
	}

}
