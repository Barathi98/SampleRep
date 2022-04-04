package collections;
//Hash Table-synchronized
//slower than hash map->thread safe
import java.util.Hashtable;


public class MyHashTable {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Hashtable h=new Hashtable();
		h.put("name", "Barathi");
		h.put("Id", 100);
		h.put("Address", "chennai");
		System.out.println(h);
		
	}

}
