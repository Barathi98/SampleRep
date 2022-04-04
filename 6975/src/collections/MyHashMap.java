package collections;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
	HashMap <String,Integer> h= new HashMap <String,Integer>();
	h.put("A",101);
	h.put(null, null);
	h.put("B", 102);
	h.put("c", 103);
	h.put("D",104);
	System.out.println(h);

	}

}
