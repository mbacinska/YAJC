package org.mbacinska;

import java.util.*;

public class Movie2 {

    private String title;
    private int year;
    private double rating;

    public Movie2(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

  static class RatingCompare implements Comparator<Movie2> {

        @Override
        public int compare(Movie2 m1, Movie2 m2) {
            if (m1.rating > m2.rating) {
                return 1;
            } else if (m1.rating < m2.rating) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    static class TitleCompare implements Comparator<Movie2>{

        @Override
        public int compare(Movie2 m1, Movie2 m2) {
            return m1.title.compareTo(m2.title);
        }
    }

    public static void main(String[] args) {

        List<Movie2> movies = new ArrayList<>();
        movies.add(new Movie2("Force Awakens", 2015, 8.3));
        movies.add(new Movie2("Star Wars", 1977, 8.7));
        movies.add(new Movie2("Empire Strikes Back", 1980, 8.8));
        movies.add(new Movie2("Return of the Jedi", 1983, 8.4));

        System.out.println("Sorted by rating");
        Collections.sort(movies,new RatingCompare());

        for (Movie2 movie: movies)
            System.out.println(movie.rating+ " " + movie.title + " " + movie.year);


        System.out.println("Sorted by title");

        Collections.sort(movies, new TitleCompare());

        for (Movie2 movie: movies)
            System.out.println(movie.rating+ " " + movie.title + " " + movie.year);

    }


    }


