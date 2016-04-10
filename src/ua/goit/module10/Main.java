package ua.goit.module10;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = "My name is Nick";
        System.out.println("Text: " + text);
        DataInputStream in = null;

        try {
            // Write encoded text to a file
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("outFile")));
            String encodedText = CipherAlgorithm.encode(text, 10);
            System.out.println("Encoded(to file): " + encodedText);
            out.writeUTF(encodedText);
            out.close();

            // Read encoded text from a file
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("outFile")));
            String textFromFile = in.readUTF();
            String decodedTextFromFile = CipherAlgorithm.decode(textFromFile, 10);
            System.out.println("Decoded(from file): " + decodedTextFromFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}