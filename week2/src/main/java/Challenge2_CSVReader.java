package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Challenge2_CSVReader {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week2\\src\\main\\java\\effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv";
        Files.lines(Paths.get(filePath))
                .skip(0) // ignore the first entry
                .forEach(System.out::println);
    }
}
