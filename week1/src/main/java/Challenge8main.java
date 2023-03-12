package main.java;

import java.io.*;
import java.util.Objects;

public class Challenge8main {
    public static void main(String[] args) {
        Challenge8Reader c = new Challenge8Reader();


// Read the CSV file and store the data in a list of “HospitalRecord” objects
        try {
            BufferedReader br = new BufferedReader(new FileReader(c.getPath())); //create bufferedreader, add reader, give reader path

            String[] HospitalRecords;
            int cardioVisit;
            int cardioVisitSum = 0;

            int radiologyVisit = 0;
            int radiologyVisitSum = 0;

            int visiting;
            int visitingSum = 0;
            String line;
            while ((line = br.readLine()) != null) { //loop until there are no new lines
                HospitalRecords = line.split(",");
//Calculate the total number of visitors per department per month and store the data in a Map
                if (Objects.equals(HospitalRecords[1], "Cardiology")) {
                    cardioVisit = Integer.parseInt(HospitalRecords[2]);
                    cardioVisitSum = cardioVisitSum + cardioVisit;
                }

                if (Objects.equals(HospitalRecords[1], "Radiology")) {
                    radiologyVisit = Integer.parseInt(HospitalRecords[2]);
                    radiologyVisitSum = radiologyVisitSum + radiologyVisit;
                }
                if (Objects.equals(HospitalRecords[1], "Visiting")) {
                    visiting = Integer.parseInt(HospitalRecords[2]);
                    visitingSum = visitingSum + visiting;
                }

            }
            c.getVisitCount().put("Cardiology visitors", cardioVisitSum);
            c.getVisitCount().put("Radiology visitors", radiologyVisit);
            c.getVisitCount().put("Visitors", visitingSum);

            System.out.println(c.getVisitCount());


        } catch (FileNotFoundException e) { //error if file is not found
            e.printStackTrace();
        } catch (IOException e) { //error with the input/output
            e.printStackTrace();
        }

//Define a class that models the txt file
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week1\\src\\hospital.txt");
            fw.write(String.valueOf(c.getVisitCount()));
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}


// TODO: Implement encapsulation principles to ensure that data is accessed and modified only through appropriate methods (use of getter and setter methods)