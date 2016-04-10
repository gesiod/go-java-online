package ua.goit.module7.module3;

public abstract class Instrument {

    public abstract String getType();

    @Override
    public String toString() {
        return getType();
    }
}