package main.java;

import java.util.HashMap;

public class Challenge8Reader

{

    private final HashMap<String, Integer> VisitCount = new HashMap<>();

    public String getPath() {
        //make path
        String path = "C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week1\\src\\hospital.csv";
        return path;
    }



    public HashMap<String, Integer> getVisitCount() {
        return VisitCount;
    }


}
