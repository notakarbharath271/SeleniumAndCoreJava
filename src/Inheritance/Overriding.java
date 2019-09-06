
/*
 Inheritance:
------------

1.Single(1 parent and 1 child)
2.Multi level (1 parent and more then one child)
3.Mutiple (2 parents and 1 child)(cannot achive using class)
4.Hirarchical(1 parent and 2 child but there no relationship b/w the 2 class(childs))
5.Hybrid (combination of Multiple and Hirarchical)


 Method Overriding:
------------------
Re-Defining the same method from parent class into child class.
body may be different
class A
{
  void m1() //defination
	{
	//code//body
	}
}

class B extends A //defination
{
  void m1()
	{
	//code //body
	}
}

Method Overloding v/s Method Overriding
---------------------------------------

Method Overloding				Method Overriding
--------------------------------------------------------------------------------------------
no inheritanc required				atleast we should have 2classes(1 parent 1child)
defination(method) should not be same		defination(method) should be same*/



package Inheritance;



class BANK {					//patent
	int getRateOfintrest(){
		return 0;
	}
}

class SBI extends BANK{			//child :override
	int getRateOfintrest(){
		return 15;
	}
}

class ICICI extends BANK{		//child :override
	int getRateOfintrest(){
		return 10;
	}
}

class AXIS extends BANK{		//child :override
	int getRateOfintrest(){
		return 12;
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		SBI sbiobj=new SBI();
		System.out.println("Rate of Ineterst of SBI Bank:"+sbiobj.getRateOfintrest());
		
		ICICI iciciobj=new ICICI();
		System.out.println("Rate of Ineterst of ICICI Bank:"+iciciobj.getRateOfintrest());
		
		AXIS axisobj=new AXIS();
		System.out.println("Rate of Ineterst of AXIS Bank:"+axisobj.getRateOfintrest());
		
	}

}
