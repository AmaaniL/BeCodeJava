package main.java;

import java.util.Scanner;

public class Challenge1_Measurements {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Choose unit mm, cm or m:");

        String input = myObj.nextLine();  // Read user input
        Challenge1_Area test = new Challenge1_Area();

        switch (input) {
            case "mm":
                System.out.println("You chose millimeter");

                System.out.println("Input length in mm:");

                double length = myObj.nextDouble();  // Read user input
                System.out.println("Input width in mm:");

                double width = myObj.nextDouble();
                double area = test.Area(length, width);
                area = area * Challenge1_MeasurementsEnum.MILLIMETER.length;

                System.out.println(area + "m²");

                break;

            case "cm":
                System.out.println("You chose centimeter");
                System.out.println("Input length in cm:");

                length = myObj.nextDouble();  // Read user input
                System.out.println("Input width in cm:");

                width = myObj.nextDouble();
                area = test.Area(length, width);
                area = area * Challenge1_MeasurementsEnum.CENTIMETER.length;
                System.out.println(area + "m²");

                break;

            case "m":
                System.out.println("You chose meter");
                System.out.println("Input length in m:");

                length = myObj.nextDouble();  // Read user input
                System.out.println("Input width in m:");

                width = myObj.nextDouble();
                area = test.Area(length, width);
                System.out.println(area + "m²");

                break;
            default:
                System.out.println("Invalid input");

        }
    }


}
