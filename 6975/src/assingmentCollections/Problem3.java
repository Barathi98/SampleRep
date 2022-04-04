package assingmentCollections;
/*Create an ArrayList which will be able to store only Strings. 
Create a printAll method which will print all the elements 
using an Iterator.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem3 {
	public static void printAll(List<String> list)
	{
		Iterator<String> i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	}
		}
	public static void main(String[] args) {
		List <String> list=new ArrayList <String>();
list.add("a");
list.add("b");
list.add("c");
list.add("d");
list.add("e");
printAll(list);
	}


		
	}


