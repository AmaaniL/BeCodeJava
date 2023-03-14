package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Challenge2_CSVReader {
    public static void main(String[] args) throws IOException {
        var filePath = "C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week2\\src\\main\\java\\effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv";
        var fileEntries = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null)
                fileEntries.add(line);
        }
        System.out.println(fileEntries);

        fileEntries.remove(0); // remove the csv header entry

    }
}
