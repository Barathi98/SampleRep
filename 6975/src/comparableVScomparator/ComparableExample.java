package comparableVScomparator;
//Comparable sorted by year
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie1 implements Comparable<Movie1>
{
	 double rating;
	 String name;
	 int year;
	public String toString() {
		return "Movie (rating= " + rating + ", name=" + name + "year=" + year + ")";

	}
	public Movie1(String name,double rating,int year)
	{
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	@Override
	public int compareTo(Movie1 o) {
		return this.year-o.year;
	}
	
}
public class ComparableExample {

	public static void main(String[] args) {
		List<Movie1> list = new ArrayList<Movie1>();
		list.add(new Movie1("Beast",7.5,2022));
		list.add(new Movie1("KGF2",9.7,2021));
		list.add(new Movie1("Valimai",7.2,2020));
		list.add(new Movie1("RRR",9.9,2022));
		Collections.sort(list);
 for(Movie1 m:list)
 {
	 System.out.println(m.name+"   "+m.rating+"   "+m.year);
 }

	}

}
