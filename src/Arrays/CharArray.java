package Arrays;

public class CharArray {

	public static void main(String[] args) {
		
		char c[]=new char[5];
		
		c[0]='A';
		c[1]='a';
		c[2]='r';
		c[3]='V';
		c[4]='b';
		System.out.println(c.length);
		for(char ch:c) {
			System.out.println(ch);
		}

	}

}
