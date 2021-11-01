/* Comparator
Create a collection for 5 Movies (private members ratings,name,year)
Using switch statements create a menu driven program
Enter your choice:
1. Sort by ratings
2. Sort by name
3. Sort by year
4. Sort by ratings in Reverse
5. Sort by name in Reverse
6. Sort by year in Reverse
7. EXIT*/



package SessionTask;
import java.util.*;

public class Comparator12 {

	public void show(List<Movies> movie) {

		for (Movies movies : movie) {
			System.out.println(movies);
		}
	}

	public static void main(String[] args) {
		List<Movies> movie = new ArrayList<Movies>();
		movie.add(new Movies(4, "Vaali", 2000));
		movie.add(new Movies(5, "Kashi from Village", 2010));
		movie.add(new Movies(2, "Hebbuli", 2005));
		movie.add(new Movies(3, "Pailwaaan", 2015));
		Scanner in = new Scanner(System.in);
		Comparator12 comp = new Comparator12();

		while (true) {
			System.out.println(
					"\n 1.Sort by Ratings \n 2.Sort by Name \n 3.Sort by Year \n 4.Sort by Ratings in Reverse \n 5.Sort By Name in Reverse\n 6.Sort by Year in Reverse \n 7.Exit");
			System.out.println("Enter Your Choice");
			int ch = in.nextInt();
			switch (ch) {
			case 1:
				Collections.sort(movie, new SortByRating());
				System.out.println("--Sorted by Ratings--");
				comp.show(movie);

				break;
			case 2:
				Collections.sort(movie, new SortByName());
				System.out.println("--Sorted by Name--");
				comp.show(movie);
				break;
			case 3:
				Collections.sort(movie, new SortByYear());
				System.out.println("--Sorted by Year--");
				comp.show(movie);
				break;
			case 4:
				Collections.sort(movie, new SortByRating1());
				System.out.println("--Sorted by Ratings in Reverse--");
				comp.show(movie);
				break;
			case 5:
				Collections.sort(movie, new SortByName1());
				System.out.println("--Sorted by Name  in Reverse--");
				comp.show(movie);
				break;
			case 6:
				Collections.sort(movie, new SortByYear1());
				System.out.println("--Sorted by Year in Reverse--");
				comp.show(movie);
				break;
			case 7:
				System.exit(0);
			}

		}

	}

}

class Movies {
	int ratings;
	String name;
	int year;

	public Movies(int ratings, String name, int year) {

		this.ratings = ratings;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "ratings=" + ratings + ", name=" + name + ", year=" + year;
	}

}

class SortByRating implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		return o1.ratings - o2.ratings;
	}

}

class SortByName implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		return o1.name.compareTo(o2.name);
	}

}

class SortByYear implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		return o1.year - o2.year;
	}

}

class SortByRating1 implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		return o2.ratings - o1.ratings;
	}

}

class SortByName1 implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		return o2.name.compareTo(o1.name);
	}

}

class SortByYear1 implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		return o2.year - o1.year;
	}
}
	
