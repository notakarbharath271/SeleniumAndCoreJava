package datastructures;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("Bharath");
		al.add("Sarath");
		al.add("Lavanya");
		al.add("Nani");
		al.add("Naveen");
		
		System.out.println(al.size());
		System.out.println(al);
		
		for(String s:al) {
			System.out.println(s);
		}
		

	}

}
