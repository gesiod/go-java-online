package ua.goit.module6.task2.module3;

public class NoSuchInstrumentException extends Exception {

    private String nonExistentInstrumentMessage;

    public NoSuchInstrumentException(String nonExistentInstrumentMessage) {
        this.nonExistentInstrumentMessage = nonExistentInstrumentMessage + "\n";
    }

    @Override
    public String getMessage() {
        return nonExistentInstrumentMessage;
    }
}