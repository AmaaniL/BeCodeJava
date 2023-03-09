package main.java;

import java.io.*;

public class Challenge6 {

    public static void main(String[] args) throws IOException {
        String FILE_PATH = "words.txt";
        new FileUtil(FILE_PATH);
        System.out.println("No. of characters in file: " + FileUtil.getCharCount());
    }
}

class FileUtil {
    static BufferedReader reader = null;

    public FileUtil(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        reader = new BufferedReader(input);
    }

    public static int getCharCount() throws IOException {
        int charCount = 0;
        String data;
        while ((data = reader.readLine()) != null) {
            charCount += data.length();
        }
        return charCount;
    }
}
