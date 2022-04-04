package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingElements {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();  
        list1.add("C");  
        list1.add("Core Java");  
        list1.add("Advance Java");  
        System.out.println("Initial collection value:"+list1);  
        Collections.addAll(list1, "Servlet","JSP");  
        System.out.println("After adding elements collection value:"+list1);  
        String[] list2 = {"C#", ".Net"};  
        Collections.addAll(list1, list2);  
        System.out.println("After adding array collection value:"+list1);  
    }  
}  

