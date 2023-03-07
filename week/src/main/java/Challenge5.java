package main.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("File? ");
            String file = scanner.nextLine();
            Path filePath = Paths.get(file);
            countWordAppearance(filePath.toFile());
        } catch (IOException ioe) {
            System.out.println("Exception thrown:");
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }

    private static void countWordAppearance(File file) throws IOException {
        Scanner sc = new Scanner(file);
        Map<String, Integer> result = new HashMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            // Trimming first
            String trimmedLine = line.trim(); //Remove whitespace from both sides of a string:
            String[] words = trimmedLine.split(" ");

            countWordsInLine(words, result);
        }

        for (String word : result.keySet()) {
            System.out.println(word + " was found " + result.get(word) + " times");
        }
    }

    /**
     * Right here we are passing a reference by value in this method. In other words: we are passing the
     * address of the 'line' object and the address of the 'result map' object. In java, if a type is not
     * a primitive, it is a reference object. This means that I am not passing an actual array of the Strings,
     * I am passing an address of an object which happens to be an array of Strings. It is the same for the
     * result map.
     * <p>
     * Because of this, we don't need a return type. We are doing operations on the map object. Both this method
     * and the parent method have the same reference to this object, so they both 'know' about the changes.
     */
    private static void countWordsInLine(String[] line, Map<String, Integer> resultMap) {
        //We can do this in a completely functional style as well, but that is for later in the learning path.
        for (String word : line) {
            Integer count = resultMap.get(word);
            if (count == null) { // means we don't have that word yet
                resultMap.put(word, 1);
            } else {
                resultMap.put(word, ++count); // there is a caveat here with the ++ count, see prefix and post forms!
            }
        }
    }
}