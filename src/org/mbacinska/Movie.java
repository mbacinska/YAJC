package org.mbacinska;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie> {

    private String title;
    private int year;
    private double rating;

    public Movie(String title, int year, double rating) {
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

    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }


    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Star Wars", 2015, 8.3),
                new Movie("Force Awakens", 2016, 7.8),
                new Movie("Return of the Jedi", 1983, 8.4),
                new Movie("Empire Strikes Back", 1980, 8.8));


        for (Movie movie:movies){

            System.out.println(movie.getTitle()+ " " + movie.getYear() +" " +movie.getRating());
        }

        Collections.sort(movies);

        System.out.println("After sorting ");


        for (Movie movie:movies){

            System.out.println(movie.getTitle()+ " " + movie.getYear() +" " +movie.getRating());
        }


    }

    }


