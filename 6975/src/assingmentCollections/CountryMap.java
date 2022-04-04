package assingmentCollections;
/*Develop a java class with a instance variable CountryMap HashMap (M1) 
* add a method saveCountryCapital(String CountryName, String capital) , 
* the method should add the passed country and capital as key/value in the map M1 and return the 
Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed 
from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name 
passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as 
the key and value as Country and returns the Map M2.
Key – Capital Value – Country
Delhi India
Tokyo Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all 
the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method
*/
import java.util.ArrayList;
//problem9
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {
	
	static HashMap<String,String>M1;
	public CountryMap()
	{
		M1=new HashMap<String,String>();
	}
	public HashMap<String,String> saveCountryCapital(String CountryName,String Capital)
	{
		M1.put(CountryName, Capital);
		return M1;
	}
	public static String getCapital(String CountryName)
	{
		return M1.get(CountryName);
		
	}
	public static String getCountry(String Capital)
	{
	Set<Entry<String,String>> set=M1.entrySet();
	Iterator<Entry<String,String>> itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry<String, String> obj=itr.next();
	if(obj.getValue().equals(Capital))
	return obj.getKey();
	}
	return null;
	
	}
	public static HashMap<String, String> swapKeyValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> obj = it.next();
			M2.put(obj.getValue(), obj.getKey());
		}
		
		return M2;
	}
	
	public static ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}


	public static void main(String[] args) {
		CountryMap c=new CountryMap();
		c.saveCountryCapital("India", "Delhi");
		c.saveCountryCapital("USA", "Washington");
		c.saveCountryCapital("Japan", "Tokyo");
		c.saveCountryCapital("Austarlia", "Canberra");
		System.out.println("The capital of India is "+CountryMap.getCapital("India"));
		System.out.println("The country of Tokyo is "+CountryMap.getCountry("Tokyo"));
		System.out.println(CountryMap.toArrayList());
		
		HashMap<String, String> M2 = CountryMap.swapKeyValue();
		System.out.println(M2);
	}

}
