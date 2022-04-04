package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WrapperSort 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();  
		al.add(Integer.valueOf(201));  
		al.add(Integer.valueOf(101));  
		al.add(230);//internally will be converted into objects as Integer.valueOf(230)  
		  
		Collections.sort(al);  
		@SuppressWarnings("rawtypes")
		Iterator itr=al.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		 }  
		Comparable <Integer> t=Collections.max(al); //return maximum value of the list
		System.out.println("The maximum value is "+t);
		Comparable <Integer> t1=Collections.min(al);//return minimum value of the list
		System.out.println("The minimum value is "+t1);
	}  

}


