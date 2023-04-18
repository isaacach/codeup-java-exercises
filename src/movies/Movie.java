package src.movies;

import src.util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    private String category;
    private String name;

    public Movie(String name, String category) {
        this.category = category;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Movie[] addMovie(Object[] movies, Object movie) {
        Movie[] copy = (Movie[]) Arrays.copyOf(movies, movies.length + 1);
        copy[movies.length] = (Movie) movie;
        return copy;
    }
    public static void getMovieByCategory (Movie[] movies, String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
    public static void getAllMovies (Movie[] movies) {
        for (Movie movie : movies) {
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }
    public static void choice() {
        Scanner sc = new Scanner(System.in);
        Movie[] setMovies = MoviesArray.findAll();
        Input input = new Input();
        int choice = -1;
        while (choice != 0) {
            choice = input.getInt("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "Enter your choice: ");
            switch (choice) {
                case 1 -> Movie.getAllMovies(setMovies);
                case 2 -> Movie.getMovieByCategory(setMovies, "animated");
                case 3 -> Movie.getMovieByCategory(setMovies, "drama");
                case 4 -> Movie.getMovieByCategory(setMovies, "horror");
                case 5 -> Movie.getMovieByCategory(setMovies, "scifi");
                case 6 -> Movie.getMovieByCategory(setMovies, "musical");
            }

        }
    }

    }
