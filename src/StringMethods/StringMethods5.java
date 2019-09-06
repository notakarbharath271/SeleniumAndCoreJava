package StringMethods;

public class StringMethods5 {

	public static void main(String[] args) {
		String s ="WELCOME";
		
		//starting index =0,starts from 0
		//ending index =1;,starts from 1
		
		System.out.println(s.substring(0, 1));//W
		System.out.println(s.substring(0, 2));//WE
		System.out.println(s.substring(0, 3));//WEL
		System.out.println(s.substring(0, 4));//WELC
		System.out.println(s.substring(0, 5));//WELCO
		System.out.println(s.substring(0, 6));//WELCOM
		System.out.println(s.substring(0, 7));//WELCOME
		
		System.out.println(s.substring(6, 7));//E
		System.out.println(s.substring(3, 7));//COME
		
		System.out.println("*********************");
		
		//replace
		
		String s1=s.replace("WEL", "BE");
		System.out.println(s1);

	}

}
