package ua.goit.module3.uml1;

public class TextFile extends File {

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Text file '" + name + "' is opened.");
    }
}