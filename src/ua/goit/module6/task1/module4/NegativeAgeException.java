package ua.goit.module6.task1.module4;

public class NegativeAgeException extends Exception {

    private String message;

    public NegativeAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}