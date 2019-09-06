package Inheritance;

class Vehicle
{
	void run()
	{
		System.out.println("Vechile is running");
	}
}

class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running");
	}
	
}
public class Overriding1 {

	public static void main(String[] args) {

		Vehicle vobj=new Vehicle();
		vobj.run();
		
		Bike bobj=new Bike();
		bobj.run();

	}

}
