package ua.goit.module7.module3;

public class Validation {

    public static void checkInstrumentAndNumber(String instrument, Integer number) throws NoSuchInstrumentException {
        isSuchInstrumentPresentInShop(instrument);
        isNumberOfInstrumentNegative(instrument, number);
        isNumberOfInstrumentsZero(instrument, number);
    }

    private static void isSuchInstrumentPresentInShop(String instrument) throws NoSuchInstrumentException {
        if (instrument != "piano" && instrument != "guitar" && instrument != "trumpet") {
            throw new NoSuchInstrumentException("[Error]: No such instrument ('" + instrument.substring(0, 1).toUpperCase() +
                    instrument.substring(1) + "') in Music Shop.");
        }
    }

    private static void isNumberOfInstrumentNegative(String instrument, Integer number) {
        if (number < 0) {
            throw new IllegalArgumentException("[Error]: Negative number of " + instrument.substring(0, 1).toUpperCase() +
                    instrument.substring(1) + "s(" + number + ").");
        }
    }

    private static void isNumberOfInstrumentsZero(String instrument, Integer number) {
        if (number == 0) {
            throw new IllegalArgumentException("[Error]: Zero number of " + instrument.substring(0, 1).toUpperCase() +
                    instrument.substring(1) + "s.");
        }
    }
}