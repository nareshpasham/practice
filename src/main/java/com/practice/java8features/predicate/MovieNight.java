package com.practice.java8features.predicate;

import java.util.*;
import java.text.SimpleDateFormat;

public class MovieNight {
	public static void canViewAll(Collection<Movie> movies) {
		/*
		 * // throw new UnsupportedOperationException("Waiting to be implemented."); //
		 * for (Movie movie : movies) for (int i=0;i<movies.size();i++){ for (int
		 * j=i+1;j<movies.size()-1;j++) {
		 * System.out.println(canViewChecker(movies.stream().anyMatch(d->d.getStart().
		 * compareTo(d.getEnd())==0?false:true),i,j)); }
		 * 
		 * }
		 * 
		 */}

	private static Boolean canViewChecker(Movie movie,int i,int j) {
		boolean flagView;
		int b3 = movie.getStart().compareTo(movie.getEnd());
		if (b3 == 0) {
			System.out.println("Your plan will expire today ");
			flagView = false;
		} else if (b3 > 0) {
			System.out.println("Your plan has not expired. You can still avail our facility.");
			flagView = true;
		} else {
			System.out.println("oops!Your plan has expired\nRecharge fast.");
			flagView = true;
		}
		return flagView;
	}
	
	/*
	 * public boolean check_time_overlap($start_time1, $end_time1, $start_time2,
	 * $end_time2) { return (($start_time1) <= ($end_time2) && ($start_time2) <
	 * ($end_time1) ? true : false); }
	 */


	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
		movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
		movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));
		MovieNight.canViewAll(movies);
//		System.out.println(MovieNight.canViewAll(movies));
	}
}

class Movie {
	private Date start, end;

	public Movie(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return this.start;
	}

	public Date getEnd() {
		return this.end;
	}
}
