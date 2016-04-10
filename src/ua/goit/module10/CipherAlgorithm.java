package ua.goit.module10;

public class CipherAlgorithm {

    public static String encode(String string, int offset) {
        StringBuilder encoded = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    encoded.append((char)('A' + ((c - 'A' + offset) % 26)));
                } else {
                    encoded.append((char)('a' + ((c - 'a' + offset) % 26)));
                }
            } else {
                encoded.append(c);
            }
        }

        return encoded.toString();
    }

    public static String decode(String string, int offset) {
        return encode(string, 26 - offset);
    }
}