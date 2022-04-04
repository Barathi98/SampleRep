package collections;
//disjoint()- two collections are disjoint if they have no elements in common. 
//It returns true if the two collections do not have any element in common. 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDisjoint 
{

	public static void main(String[] args) 
	{
		List <String> list1= new ArrayList<String>(); 
		list1.add("Shoes");
        list1.add("Toys");
        list1.add("Horse");
        list1.add("Tiger");
        List<String> list2 = new ArrayList<>();
        list2.add("Bat");
        list2.add("Frog");
        list2.add("Lion");
        System.out.println(Collections.disjoint(list1, list2));
	}

}
