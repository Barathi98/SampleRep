package comparableVScomparator;
//Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
	private double rating;
	private String name;
	private int year;

	public Movie(String name, Double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public double setRating(double rating) {
		return this.rating = rating;

	}

	public double getRating() {
		return rating;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getName() {
		return name;
	}

	public int setYear(int year) {
		return this.year = year;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return "Movie (rating= " + rating + ", name=" + name + "year=" + year + ")";

	}
}

class YearCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		return o1.getYear() - o2.getYear();
	}

}

class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if (o1.getRating() < o2.getRating())
			return -1;
		else if (o1.getRating() > o2.getRating())
			return 1;
		else
			return 0;
	}
}

class NameCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Beast", 7.5, 2022));
		list.add(new Movie("KGF2", 9.7, 2021));
		list.add(new Movie("Valimai", 7.2, 2020));
		list.add(new Movie("RRR", 9.9, 2022));
		//Sort by rating
		System.out.println("Sorted by rating");
		RatingCompare ratingcompare=new RatingCompare();
	Collections.sort(list, ratingcompare);
		for(Movie m:list)
		{
			System.out.println(m.getRating()+"  "+m.getName()+"  "+m.getYear());
		}
		System.out.println("------------------------");
		//sort by name
		System.out.println("Sorted by name");
		NameCompare namecompare=new NameCompare();
		Collections.sort(list, namecompare);
		for(Movie m:list)
		{
			System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
		System.out.println("------------------------");
		//sort by year
		System.out.println("Sorted by year");
		YearCompare yearCompare=new YearCompare();
		Collections.sort(list,yearCompare);
		for(Movie m:list)
		{
			System.out.println(m.getYear()+"  "+m.getName()+"  "+m.getRating());
		}
	}
    
}
