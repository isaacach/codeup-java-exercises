package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOPractice {
    public static void main(String[] args) {
        String directory = "data";
        String filename = "groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (Files.notExists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> groceryList = Arrays.asList("coffee", "milk", "oreos");

        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("peanut oil", "flour", "eggs");
            Files.write(dataFile, moreGroceries, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            System.out.println(groceryListFromFile);
            for (int i = 0; i < groceryListFromFile.size(); i++) {
                System.out.println((i+1) + ": " + groceryListFromFile.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean hasPowderedSugar = false;
        try {
            List<String> lines = Files.readAllLines(dataFile);
            for (String line : lines) {
                if (line.equals("powdered sugar")) {
                    hasPowderedSugar = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (!hasPowderedSugar) {
                List<String> addPowderedSugar = List.of("powdered sugar");
                Files.write(dataFile, addPowderedSugar, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            List<String> lines = Files.readAllLines(dataFile);
            List<String> newList = new ArrayList<>();
            for (String line : lines) {
                if (line.equals("oreos")) {
                    newList.add("chips ahoy");
                } else {
                    newList.add(line);
                }
            }
            Files.write(dataFile, newList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
