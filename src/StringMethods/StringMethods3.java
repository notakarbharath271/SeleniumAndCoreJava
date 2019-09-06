package StringMethods;

public class StringMethods3 {

	public static void main(String[] args) {

		//comparing the two strings
		String s ="Bharath";
		String s1 ="BHARATH";
		String s2="bharath";
		
		System.out.println(s.equals(s1));//false,because case sensitive
		
		System.out.println(s.equalsIgnoreCase(s2));//true
		System.out.println(s.equalsIgnoreCase(s1));

	}

}
