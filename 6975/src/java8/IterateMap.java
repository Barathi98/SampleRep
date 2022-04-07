package java8;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		Map<String,Integer> price=new HashMap();
		price.put("Apple",50);
		price.put("Orange",30);
		price.put("Banana", 10);
		price.put("Grapes", 40);
        price.put("Papaya", 50);
//        for(Map.Entry<String, Integer>entry:price.entrySet())
//        {
//        	System.out.println("Fruit:"+entry.getKey()+"Price:"+entry.getValue());
//        }
        price.forEach((k,v)->System.out.println("Fruit:"+k+"Price:"+v));
	}

}
