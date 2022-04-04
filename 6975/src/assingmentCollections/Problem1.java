package assingmentCollections;
//array list
/*Develop a java class with a method saveEvenNumbers(int N) 
using ArrayList to store even numbers from 2 to N, where N is a 
integer which is passed as a parameter to the method 
saveEvenNumbers(). 
The method should return the ArrayList (A1) created. In the 
same class create a method printEvenNumbers()which iterates 
through the arrayList A1 in step 1, and It should multiply 
each number with 2 and display it in format 4,8,12….2*N. and 
add these numbers in a new ArrayList (A2). 
The new ArrayList (A2) created needs to be returned. Create a 
method printEvenNumber(int N) parameter is a number N. This 
method should search the arrayList (A1) for the existence of 
the number ‘N’ passed. If exists it should return the Number 
else return zero.Hint: Use instance variable for storing the 
ArrayList A1 and A2.
NOTE: You can test the methods using a main method.
*/
//printing the even numbers and multiplying with 2
import java.util.ArrayList;
public class Problem1 {
	ArrayList <Integer>list=new ArrayList <Integer>();
@SuppressWarnings("rawtypes")
ArrayList SaveEvenNumber(int num)
{
	list=new ArrayList<Integer>();
	for(int i=2;i<=num;i++)
	{
		if(i%2==0)
		
		list.add(i);
		System.out.println(list);
		}
	return list;
}
ArrayList <Integer> PrintEvenNum()
{
	ArrayList<Integer> list2= new ArrayList<Integer>();
	for(int i:list) //will search for the even numbers list
	{
		list2.add(i*2);
		System.out.println(i*2);
	}
	return list2;
}

	public static void main(String[] args) {
		Problem1 p=new Problem1();
		p.SaveEvenNumber(20);
		p.PrintEvenNum();
		
	}

}

	