package CondtionalStatements;

public class SmallestNumber {

	public static void main(String[] args) {
		int a=200;
		int b=3025;
		int c=500;
		if(a<b&&a<c) {
			System.out.println("a is smaller then b&c");
			
		}else if(b<c) {
			System.out.println("b is smaller then a&c");
		}else
		{
			System.out.println("c is smaller then a&b");
		}
			

	}

}
