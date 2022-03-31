package collections;
//HashSet-unordered elements with unique elements
//under set interface->unordered unique elements
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {
@SuppressWarnings("unchecked") 
public static void main(String args[])
{
	@SuppressWarnings("rawtypes") //Eclipse will suppress all raw-types warnings inside that method.
	Set hash =new HashSet();
	hash.add("Barathi");
	hash.add("Barathi");
	hash.add("Surya");
	hash.add("manju");
	hash.add("mohammad");
	hash.add("shanavas");
	hash.add("karuna");
	System.out.println(hash);
	@SuppressWarnings("rawtypes")
	Iterator i=hash.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
