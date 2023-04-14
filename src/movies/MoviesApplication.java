package src.movies;

import src.util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] setMovies = MoviesArray.findAll();
        Input input = new Input();
        Movie.choice();
    }
}
