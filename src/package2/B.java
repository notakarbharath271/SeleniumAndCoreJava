package package2;

import package1.A;

public class B extends A {

	public static void main(String[] args) {
		//default
		//A aobj=new A();// allows to create the object of the class A
		//aobj.a;	//but not allow to access the variables,methodes of the class A because in class A the variables and methods are default
		//aobj.m1();
		
		//protected(only through the inheritance(parent&child),child class extends parent class but we want to create the object of the child.
		/*B bobj=new B();
		bobj.a=50;
		bobj.m1();*/
		
		//parent class :by using the parent object we can accessible directly in the child class 
		A aobj=new A();
		aobj.a=60;
		aobj.m1();
		
		//child class with object of class B can acess through only when the child is extends the parent
		B bobj=new B();
		bobj.a=40;
		bobj.m1();
	}

}
