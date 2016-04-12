package ua.goit.module9;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // List of files
        SortedSet<File> myFiles = new TreeSet<>();
        myFiles.add(new TextFile("Document", 70));
        myFiles.add(new ImageFile("Picture", 10));
        myFiles.add(new AudioFile("Song", 30));

        // Text representation of the list
        StringBuilder stringBuilder = new StringBuilder();
        myFiles.stream().forEach(file -> stringBuilder.append(file.getName() + " "));
        String originalText = stringBuilder.toString().trim();

        // Encode & decode
//        String encodedText = CipherAlgorithm.encode(originalText, 12);
//        String decodedText = CipherAlgorithm.decode(encodedText, 12);

        String encodedText = CipherAlgorithm.encode("Good", 12);
        String decodedText = CipherAlgorithm.decode(encodedText, 12);

        // Print out the results
        System.out.println("Original text: " + originalText);
        System.out.println("Encoded text: " + encodedText);
        System.out.println("Decoded text: " + decodedText);
    }
}