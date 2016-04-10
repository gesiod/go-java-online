package ua.goit.module6.task2.module3;

public abstract class Instrument {

    public abstract String getType();

    @Override
    public String toString() {
        return getType();
    }
}