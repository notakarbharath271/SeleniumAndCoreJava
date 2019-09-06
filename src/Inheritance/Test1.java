package Inheritance;

class A {
	int a;
	int b;
	
	void display() {
		System.out.println(a+b);
	}
}
	class B extends A {
		int x;
		int y;
		
		void show() {
			System.out.println(x+y);
		}
	}
	
	class C extends B{
		int  p;
		int q;
		void sum() {
			System.out.println(p+q);
		}
	}


public class Test1 {

	public static void main(String[] args) {
		/*A aobj=new A();
		aobj.a=60;
		aobj.b=50;
		
		B bobj=new B();
		bobj.a=20;
		bobj.b=30;
		*/
		
		C cobj=new C();
		cobj.a=30;
		cobj.b=40;
		
		cobj.x=50;
		cobj.y=60;
		
		cobj.p=70;
		cobj.q=80;
		
		cobj.display();
		cobj.show();
		cobj.sum();
		

	}

}

