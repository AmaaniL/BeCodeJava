package main.java;

import java.io.FileWriter;
import java.util.Random;

public class Challenge9 {

    public static void main(String[] args) {

        String[] firstNames = {"Asher", "Allyson", "Mara", "Destiney", "Guadalupe", "Jolie", "Kathy", "Levi", "Derrick", "Zachariah", "Lillian", "Ingrid", "Aleena", "Diya", "Rebecca", "Joaquin", "Ethan", "Isai", "Janiya", "Alfonso", "Houston", "Tia", "Karlie", "Geovanni", "Iris", "Jessie", "Kierra", "Declan", "Kendra",};
        String[] lastNames = {"Smith",
                "Johnson",
                "Williams",
                "Brown",
                "Jones",
                "Garcia",
                "Miller",
                "Davis",
                "Rodriguez",
                "Martinez",
                "Hernandez",
                "Lopez",
                "Gonzales",
                "Wilson",
                "Anderson",
                "Thomas",
                "Taylor",
                "Moore",
                "Jackson",
                " Martin",
                "Lee",
                "Johnson",
                "White",
                "Harris",
                "Sanchez",
                "Clark",
                "Ramirez",
                "Lewis",
                "Robinson"};
        String[] reason = {"appointment", "visit"};
        String[] department = {"Cardiology", "Radiology", "Pediatrics", "Geriatrics", "Pulmonology"};


        try {
            FileWriter fw = new FileWriter("C:\\Users\\Marieke\\becode\\oefeningen\\03.Mountain\\week1\\src\\hospital.csv");
            int i = 0;
            while (i < 100) {
                String rndFirstName = (firstNames[new Random().nextInt(firstNames.length)]);
                String rndLastName = (lastNames[new Random().nextInt(lastNames.length)]);
                String rndReason = (reason[new Random().nextInt(reason.length)]);
                String rndDepartment = (department[new Random().nextInt(department.length)]);
                String info = (rndFirstName + "," + rndLastName + "," + rndReason + "," + rndDepartment + "\n");
                fw.write(info);
                i++;
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}

