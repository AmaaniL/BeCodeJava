package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Challenge2_CSVFileStream {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week2\\src\\main\\java\\effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv");

       Map<String, Long> dataMap = Files.lines(path)
                .skip(1)
                .map(Challenge2_CSVFileStream::getData)
                .filter(challenge2CovidData -> challenge2CovidData.getYear() == 2016) //challenge 3 and 4 filter on year
                // .filter(challenge2CovidData -> "All".equals(challenge2CovidData.getCountry())) //challenge 3 filter where country is "all"
                .filter(challenge2CovidData -> "$".equals(challenge2CovidData.getMeasure()))//challenge 4 filter on dollar sign
                .collect(Collectors.groupingBy(Challenge2_CovidData::getDirection, counting()));//counts how many of each direction there are.
        System.out.println(dataMap);
                //.forEach(System.out::println);

    }

    private static Challenge2_CovidData getData(String line) {

        String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

        return new Challenge2_CovidData(fields[0], Integer.parseInt(fields[1]), fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], Long.parseLong(fields[8]), Long.parseLong(fields[9])); //lines to object


    }
}

