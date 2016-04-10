package ua.goit.module10;

import java.io.*;

public class DataOperations {

    public void writeToFile(String text, String fileName) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        out.writeUTF(text);
        out.close();
        System.out.println("Text \"" + text + "\" written to file.");
    }

    public String readFromFile(String outFile) throws IOException {
        DataInputStream in = null;
        String textFromFile = null;
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("outFile")));
            textFromFile = in.readUTF();
            System.out.println("Text \"" + textFromFile + "\" readed from file.");
            return textFromFile;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }

        return textFromFile;
    }
}
