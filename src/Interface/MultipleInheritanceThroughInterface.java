
/*
 * Mutiple (2 parents and 1 child)(cannot achive using class),by using interface it is possiable.
 * ----------------------------------------------------------------------------------------------
Multiple inheritance using interface:
-------------------------------------
--> make the relation b/w class to class we use extends keyword
--> make the relation b/w interface to class we use implements keyword
--> make the relation b/w interface to interface we use extends keyword*/
package Interface;


	interface A //parent 1
	{
		int a=10;
		void display();
	}
	
	interface B //parent 2
	{
		int b=20;
		void show();
	}
public class MultipleInheritanceThroughInterface implements A,B { //child
	

	public void show() {
		System.out.println(b);
		
	}

	public void display() {
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		MultipleInheritanceThroughInterface obj = new MultipleInheritanceThroughInterface();
		obj.display();
		obj.show();
	}

	

}
