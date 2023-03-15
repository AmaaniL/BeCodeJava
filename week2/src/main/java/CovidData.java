package main.java;

import java.io.IOException;


public class CovidData {
    private final String direction;
    private final Integer year;
    private final String date;
    private final String weekday;
    private final String country;
    private final String commodity;
    private final String transportMode;
    private final String measure;
    private final Long value;
    private final Long cumulative;

    public CovidData(String direction, Integer year, String date, String weekday, String country, String commodity, String transportMode, String measure, Long value, Long cumulative) {
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

    public Integer getYear() {
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

    public Long getValue() {
        return value;
    }

    public Long getCumulative() {
        return cumulative;
    }
// end getters


    @Override
    public String toString() {
        return "Challenge2_CSVReader{" +
                "direction='" + direction + '\'' +
                ", year=" + year +
                ", date='" + date + '\'' +
                ", weekday='" + weekday + '\'' +
                ", country='" + country + '\'' +
                ", commodity='" + commodity + '\'' +
                ", transportMode='" + transportMode + '\'' +
                ", measure='" + measure + '\'' +
                ", value=" + value +
                ", cumulative=" + cumulative +
                '}';
    } //toString

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week2\\src\\main\\java\\effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv";


    }
}
