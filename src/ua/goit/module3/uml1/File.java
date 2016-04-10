package ua.goit.module3.uml1;

public abstract class File {

    // File name
    protected String name;

    public String getName() {
        return name;
    }

    public abstract void open();
}