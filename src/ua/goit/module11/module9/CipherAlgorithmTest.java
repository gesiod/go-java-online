package ua.goit.module11.module9;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.goit.module9.CipherAlgorithm;

import static org.junit.Assert.assertEquals;

public class CipherAlgorithmTest {

    private static CipherAlgorithm cipherAlgorithm = null;

    @BeforeClass
    public static void setUp() throws Exception {
        cipherAlgorithm = new CipherAlgorithm();
    }

    @Test(timeout = 2000)
    public void encode() throws Exception {
        String text = "Good";
        int offset = 12;
        String expected = "Saap";
        String result = cipherAlgorithm.encode(text, offset);
        assertEquals(expected, result);
    }

    @Test(timeout = 2000)
    public void decode() throws Exception {
        String text = "Saap";
        int offset = 12;
        String expected = "Good";
        String result = cipherAlgorithm.decode(text, offset);
        assertEquals(expected, result);
    }
}