package assingmentCollections;
/*Create an ArrayList which will be able to store only numbers 
like int,float,double,etc, but not any other data type.
*/
import java.util.ArrayList;
import java.util.List;


class MyArrayList<E> extends ArrayList<E> {
	
	public boolean add(E e) {
		//This method is used to append an element to a ArrayList. 
        //Element to be appended to this list. 
        //Return Value : Returns true if the element was successfully added; false otherwise.		
		if (e instanceof Integer || e instanceof Float || e instanceof Double) 
		{
			super.add(e);
			return true;
		} 
		else 
		{
			throw new ClassCastException("Only Integer, Float, and Double are valid");
		}
	}
}

public class Problem4 {

	public static void main(String[] args) {
		List l = new MyArrayList<>();
		
		try {
			l.add(11);
			l.add(11.2F);
			l.add(11.1678);
			l.add("list");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(l);

	}

}
