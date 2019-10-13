package org.mbacinska;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Movie {


    private String title;
    private double rating;


    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }


}

public class ComparatorOfDoubles {

    static List<Movie> movies = Arrays.asList(

            new Movie("Lord of the rings", 8.8),
            new Movie("Back to the future", 8.5),
            new Movie("Carlito's way", 7.9),
            new Movie("Pulp fiction", 8.9)
    );

    public static void printMovie() {
        for (Movie element : movies) {
            System.out.println(element.getTitle() + " " + element.getRating());
        }
    }

    public static void main(String[] args) {

        movies.sort(Comparator.comparing(Movie::getRating));
        ComparatorOfDoubles.printMovie();

//        for (Movie element : movies) {
//            System.out.println(element.getTitle()+" "+ element.getRating());
//        }

        movies.sort(Comparator.comparing(Movie::getRating).reversed());
        ComparatorOfDoubles.printMovie();

    }


}
