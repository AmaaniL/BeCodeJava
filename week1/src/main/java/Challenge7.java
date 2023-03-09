package main.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Challenge7 {
    private String date;
    private String crime;

    public static void main(String[] args) {
        String path = "C:/Users/Marieke/Desktop/SacramentocrimeJanuary2006.csv"; //make path
        String line = ""; //make line

        try {
            BufferedReader br = new BufferedReader(new FileReader(path)); //create bufferedreader, add reader, give reader path
            Challenge7 c = new Challenge7();
            c.getDate();
            while ((line = br.readLine()) != null) { //loop until there are no new lines
                String[] values = line.split(","); //split up the values
                String date = values[0];
                String crimeStatistics = values[5];
                System.out.println("Date " + date + " Crime description " + crimeStatistics);
            }
        } catch (FileNotFoundException e) { //error if file is not found
            e.printStackTrace();
        } catch (IOException e) { //error with the input/output
            e.printStackTrace();
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }
}


