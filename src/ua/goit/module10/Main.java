package ua.goit.module10;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String textFromFile = null;

        // Initial text
        String text = "My name is Nick";
        System.out.println("Text: \"" + text + "\".");

        // Text encoded
        String encodedText = CipherAlgorithm.encode(text, 10);
        System.out.println("Text encoded: \"" + encodedText + "\".");

        // Write text to file then read it from file
        try {
            DataOperations dataOperations = new DataOperations();
            dataOperations.writeToFile(encodedText, "outFile");
            textFromFile = dataOperations.readFromFile("outFile");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Text decoded
        String decodedText = CipherAlgorithm.decode(textFromFile, 10);
        System.out.println("Text decoded: \"" + decodedText + "\".");
    }
}