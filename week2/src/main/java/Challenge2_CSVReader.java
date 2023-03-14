package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Challenge2_CSVReader {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week2\\src\\main\\java\\effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv";
        Stream <String> myStream = Files.lines(Paths.get(filePath)) ;//read all lines from filePath as lines as a stream called "myStream"
        myStream.skip(0) //skip the header/first row
        .forEach(s -> System.out.println(s));

    }
}
