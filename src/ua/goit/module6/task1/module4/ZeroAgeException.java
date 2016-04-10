package ua.goit.module6.task1.module4;

public class ZeroAgeException extends Throwable {

    private String message;

    public ZeroAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}