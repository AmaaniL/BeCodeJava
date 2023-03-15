package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVFileStream {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Marieke\\repos\\03.The-Mountain\\week2\\src\\main\\java\\effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv");

        Files.lines(path)
                .skip(1)

                .map(line -> {
                    String[] fields = line.split(",");
                    return new CovidData(fields[0], Integer.parseInt(fields[1]), fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], Long.parseLong(fields[8]), Long.parseLong(fields[9]));

                })
                .forEach(System.out::println);

    }
}

