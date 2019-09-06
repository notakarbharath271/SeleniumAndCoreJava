

/*HashMap:
--------
    HashMap store two objects ie key value pairs

	keys must be unique,values may be duplicates
	*/
package datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(10, "Bharath");
		hm.put(50, "sarath");
		hm.put(6, "Lavanya");
		System.out.println(hm);
		hm.remove(50);
		System.out.println(hm);
		
		/*Set<Entry<Integer, String>> se =hm.entrySet();
		
		for(Entry<Integer, String> se1:se) {
			System.out.println(se1.getKey()+":"+se1.getValue());
		}
		*/
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
