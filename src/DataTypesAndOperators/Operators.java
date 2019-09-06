package DataTypesAndOperators;

public class Operators {

	public static void main(String[] args) {
		//Airthmetic operators + - * / %
		// a,b are variables
		//a&b are operands
		//+&= are operators
		int a=10;
		int b=20;
		
		System.out.println(a+b);//30
		System.out.println(a-b);//-10
		System.out.println(a*b);//200
		System.out.println(a/b);//0
		System.out.println(a%b);//10
		
		System.out.println("--------------------------------");
		
		//Relational Operator < > <= >= != == (reurns boolean value true/false)
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);	
		System.out.println(a!=b);
		System.out.println(a==b);
		

		System.out.println("--------------------------------");
		
		//Logical Operators &&,||,! (returns boolean value true/false)
		
		boolean x =true;
		boolean y =false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		System.out.println("--------------------------------");
		
		//Assignment Operator = += -= *= /=
		
		 int c;
		 c=a;
		 System.out.println(c);
		 c=b;
		 System.out.println(c);
		 c=100;
		 c+=5;
		 System.out.println(c);
		 
		 c=100;
		 c-=5;
		 System.out.println(c);
		 
		 c=100;
		 c/=5;
		 System.out.println(c);
		 c=100;
		 c*=5;
		System.out.println(c);
		
		System.out.println("--------------------------------");
		
		//Increment ++
		
		c=100;
		c++;//c=+1;
		System.out.println(c);
		
		System.out.println("--------------------------------");
		
		//Decrement --
		c=100;
		c--;
		System.out.println(c);
		
		

	}

}
