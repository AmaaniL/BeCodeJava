package main.java;

import java.util.Random;

public class Challenge3 {
    public static void main(String[] args) {
        int i;
        int[] intArray = new int[10];
        for (i = 0; i < 10; i++) {

            intArray[i] = randomFill();
            if (intArray[i] < 10) {
                System.out.println(intArray[i]);
            }
        }
    }

    private static int randomFill() {

        return new Random().nextInt(100);
    }
}