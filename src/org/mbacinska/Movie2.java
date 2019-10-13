package org.mbacinska;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Movie2 {

    private String title;
    private double rating;
    private boolean starred;

    public Movie2(String title, double rating, boolean starred) {
        this.title = title;
        this.rating = rating;
        this.starred = starred;
    }

    public boolean isStarred() {
        return starred;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}

class Main {

    static List<Movie2> movies = Arrays.asList(

            new Movie2("Lord of the rings", 8.8, true),
            new Movie2("Back to the future", 8.5, false),
            new Movie2("Carlito's way", 7.9, true),
            new Movie2("Pulp fiction", 8.9, false));


    public static void main(String[] args) {

        movies.sort(new Comparator<Movie2>() {
            @Override
            public int compare(Movie2 m1, Movie2 m2) {
                if (m1.isStarred() == m2.isStarred()) {
                    return 0;
                }
                return m1.isStarred() ? -1 : 1;
            }
        });


        for (Movie2 element : movies) {
            System.out.println(element.getTitle() + " " + element.getRating() + ", " + element.isStarred());
        }
    }

}