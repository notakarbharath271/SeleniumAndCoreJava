package OopsConcept;

public class Calculations {
	int a;
	int b;
	
	
	/*Methods
--------
  How to declare a method?
	1. A method may not take parameters
	2. A method takes parameters
	3. A method returns some value
	4. A method may not returns any value*/
	
	
	

	//----> 1. A method may not take parameters:Empty parameters
	
	//    4. A method may not returns any value*/
/*	void sum() {
		System.out.println(a+b);
	}*/
	
	//----> 2. A method takes parameters
	/*
	void sum(int x,int y) {
		a=x;
		b=y;
		System.out.println(a+b);
	}*/
	
	//3. A method returns some value
/*	
	int sum(int x,int y,int z){
		return x+y+z;
	}*/
	
	public static void main(String[] args) {
		Calculations calcu = new Calculations();
		
		//1. A method may not take parameters
		// when we call the method void sum()  this is relevent for the first method 
		/*calcu.a=100;
		calcu.b=200;
		calcu.sum();*/
		
		//2. A method takes parameters
		//calcu.sum(100, 200);
		
		
		//3. A method returns some value
		/*int ans = calcu.sum(20, 30, 40);
		System.out.println(ans);*/
		
	}
}
