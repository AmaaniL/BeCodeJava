package main.java;

import java.util.Scanner;

public class Challenge1_Measurements {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Choose unit mm, cm or m:");

        String input = myObj.nextLine();  // Read user input
        Area test = new Area();

        switch (input) {
            case "mm":
                System.out.println("You chose millimeter");

                System.out.println("Input length in mm:");

                double length = Double.parseDouble(myObj.nextLine());  // Read user input
                System.out.println("Input width in mm:");

                double width = Double.parseDouble(myObj.nextLine());
                double area = test.Area(length, width);
                area = area * Measurements.MILLIMETER.length;

                System.out.println(area + "m");

                break;

            case "cm":
                System.out.println("You chose centimeter");
                System.out.println("Input length in cm:");

                length = Double.parseDouble(myObj.nextLine());  // Read user input
                System.out.println("Input width in cm:");

                width = Double.parseDouble(myObj.nextLine());
                area = test.Area(length, width);
                area = area * Measurements.CENTIMETER.length;
                System.out.println(area + "m");

                break;

            case "m":
                System.out.println("You chose meter");
                System.out.println("Input length in m:");

                length = Double.parseDouble(myObj.nextLine());  // Read user input
                System.out.println("Input width in m:");

                width = Double.parseDouble(myObj.nextLine());
                area = test.Area(length, width);
                System.out.println(area + "m");

                break;
            default:
                System.out.println("Invalid input");

        }
    }


}
