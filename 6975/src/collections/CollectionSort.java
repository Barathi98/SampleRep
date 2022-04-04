package collections;
//sorting the string object
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Raina");  
		al.add("Jadeja");  
		al.add("Dhoni");  
		al.add("Samcurran");  
		  
		Collections.sort(al); 
		
	
		//It is used to get the comparator that imposes the 
		//reverse of the natural ordering on a collection of objects which implement the 
		//Comparable interface.
		//System.out.printl(al);
		//System.out.println("------------------------------");
		//Collections.reverse(al);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{  
		System.out.println(i.next());  

	    }
	//Binary Search()-To use this method, the list should be sorted in ascending order. 
    //otherwise, the result returned from the method will be wrong.	
//		System.out.println("The index of Samcurran is "+ Collections.binarySearch(al, "Samcurran")); 
//		System.out.println("The index of Dhoni is "+ Collections.binarySearch(al, "Dhoni"));
//		
		
	//Copying()-is used to copy all the elements from one list into another. 
		//After the operation, the index of each copied element in the destination list will be 
		//identical to its index in the source list. so the destination list elements are affected.
		List<String> sourceList = new ArrayList<>();
		 sourceList.add("Fafduplessis");
	        sourceList.add("Bravo");
	        sourceList.add("Ruturaj");
	        Collections.copy(al, sourceList);
	        System.out.println("After copying the list:");
	        for(String k:al)
	        {
	        	System.out.println(k);
	        }
}
}
