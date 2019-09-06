package OopsConcept;

public class Employee {
/*	
	Class is the collection of the variables and methodes.
	Object is the instance of the class(physical).
	Method is the contain a piece of code which will perform certain task. 
	Method should be part of a class. Method type is void it wont return anything.
	
	 
	 	how many way we can initialze the values to class variables
		-----------------------------------------------------------
		1. Using Object(directly)
		2. Using Constructor
		3. Using method
		
		--> Constructor is the kind of method, but the constructor name should has same name class.

			*/
	int empid;
	String empname;
	int empsalary;
	int Depno;
	
	//Constructor
	/*Employee(int id,String name,int salary,int dep){
		empid=id;
		empname=name;
		empsalary=salary;
		Depno=dep;
	}*/
		
//method for displaying the employee Details
	 void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(Depno);
	}
	 
	// 3.-----> Assinging the valuse to class variables using Method
	 void setData(int id,String name,int salary,int dep) {
		 empid=id;
			empname=name;
			empsalary=salary;
			Depno=dep;
			
		}
	
	public static void main(String[] args) {
		// 1.-----> Assinging the valuse to class variables using object
		
		
		/*Employee emp1 = new Employee();
		emp1.empid=222;
		emp1.empname="Bharatg";
		emp1.empsalary=25000;
		emp1.Depno=271;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.empid=333;
		emp2.empname="Sarath";
		emp2.empsalary=30000;
		emp2.Depno=250;
		emp2.display();*/
		
		// 2.-----> Assinging the valuse to class variables using constructor
		
		
		/*Employee emp =new Employee(222, "Bharath", 25000, 2338);
		
		emp.display();
		
		Employee emp2 =new Employee(333, "satath", 30000, 2338);
		
		emp2.display();
		*/
		
		
		
		Employee emp = new Employee();
		emp.setData(55520, "Lavanya", 50000, 555);
		emp.display();
		
		Employee emp1 = new Employee();
		emp1.setData(55521, "Naveen", 60000, 555);
		emp1.display();
		
	}

}
