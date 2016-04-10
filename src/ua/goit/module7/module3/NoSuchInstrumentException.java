package ua.goit.module7.module3;

public class NoSuchInstrumentException extends Exception {

    private String nonExistentInstrumentMessage;

    public NoSuchInstrumentException(String nonExistentInstrumentMessage) {
        this.nonExistentInstrumentMessage = nonExistentInstrumentMessage;
    }

    @Override
    public String getMessage() {
        return nonExistentInstrumentMessage;
    }
}