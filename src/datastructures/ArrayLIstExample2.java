
/*
Array limitations:
------------------
  1.Fixed in size---->Arraylist
  2.can hold same data type elements--->Object

ArrayList----> ArrayList is a data structure in java.
  ArrayList has no limit(we can store any number of elements)
  We can also store any kind of data type elements.

int a[]=new int[5]; //normal array declaration

ArrayList al=new ArrayList();//allow all data type elements.

ArrayList<String> al=new ArrayList<String>(); //allows only string type data elements

ArrayList<Integer> al=new ArrayList<Integer>(); //allows only Integer type data elements
*/
package datastructures;

import java.util.ArrayList;

public class ArrayLIstExample2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println(al.size());
		al.add(2);
		al.add(true);
		al.add("welcome");
		al.add(120.2);
		al.add('a');
		al.add(null);
		System.out.println(al.size());
		System.out.println(al);
		al.add(1, "Bharath");
		al.add(2,25);
		al.remove(null);
		al.remove(4);
		
		System.out.println(al.size());
		System.out.println(al);
		for(Object o:al) {
			System.out.println(o);
		}
		
	}

}
