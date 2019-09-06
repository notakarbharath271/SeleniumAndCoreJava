package CondtionalStatements;

public class SwitchCaseStatements {
	
	//if we have multaple condition we can use switch case
	//advg---it reduce the code

	public static void main(String[] args) {
		
		int day=1;
		switch(day)
		{
		case 1:System.out.println("Sunday");
			break;
		case 2:System.out.println("Monday");
			break;
		case 3:System.out.println("Tursday");
			break;
		case 4:System.out.println("Wednesday");
			break;
		case 5:System.out.println("Thursday");
			break;
		case 6:System.out.println("Friday");
			break;
		default :System.out.println("Saturday");	
		}

	}

}
