package collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		 Map<String,String> fruit=new HashMap<String,String>(); 
         fruit.put("Apple", "Red");
         fruit.put("Orange", "orange");
         fruit.put("Grapes", "green");
         fruit.put("Jackfruit", "Yellow");
         for(String s:fruit.keySet())
         {
        	 System.out.println(s+ " is " +fruit.get(s));
         }
	}

}
