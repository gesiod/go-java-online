package ua.goit.module11.module10;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.goit.module10.DataOperations;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class DataOperationsTest {

    private static DataOperations dataOperations = null;

    @BeforeClass
    public static void setUp() throws Exception {
        dataOperations = new DataOperations();
    }

    @Test (timeout = 2000)
    public void writeToFile() throws Exception {
        String text = "Text";
        String fileName = "outFile";
        dataOperations.writeToFile(text, fileName);
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
        String result = in.readUTF();
        in.close();
        assertEquals(text, result);
    }

    @Test (timeout = 2000)
    public void readFromFile() throws Exception {
        String text = "My text";
        String fileName = "outFile";
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        out.writeUTF(text);
        out.close();
        String result = dataOperations.readFromFile(fileName);
        assertEquals(text, result);
    }
}