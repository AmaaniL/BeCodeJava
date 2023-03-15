package main.java;

import java.io.IOException;
import java.nio.file.Files;


public class Challenge2_CSVReader {
   private final String direction;
   private final int year;
    private final  String date;
    private final  String weekday;
    private final  String country;
    private final  String commodity;
    private final  String transportMode;
    private final String measure;
    private final  int value;
    private final int cumulative;

    public Challenge2_CSVReader(String direction, int year, String date, String weekday, String country, String commodity, String transportMode, String measure, int value, int cumulative) {
        this.direction = direction;
        this.year = year;
        this.date = date;
        this.weekday = weekday;
        this.country = country;
        this.commodity = commodity;
        this.transportMode = transportMode;
        this.measure = measure;
        this.value = value;
        this.cumulative = cumulative;
    }

    public String getDirection() {
        return direction;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        return date;
    }

    public String getWeekday() {
        return weekday;
    }

    public String getCountry() {
        return country;
    }

    public String getCommodity() {
        return commodity;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public String getMeasure() {
        return measure;
    }

    public int getValue() {
        return value;
    }

    public int getCumulative() {
        return cumulative;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week2\\src\\main\\java\\effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv";
        Files.lines()

    }
}
