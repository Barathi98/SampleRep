package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
		TreeMap <String,String> tm=new TreeMap<String,String>();
		tm.put("Barathi","Karunakaran"); //(firstName, LastName)
		tm.put("Manjula","Karunakaran");
		tm.put("Karunakaran", "Ragavan");
		tm.put("Mohammad", "Manimaran");
		System.out.println(tm);
		for(Map.Entry m :tm.entrySet())
		{
			  System.out.println(m);
		}
System.out.println(tm.containsKey("A"));
System.out.println(tm.containsValue("Karunakaran"));
	}

}
