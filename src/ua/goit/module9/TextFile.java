package ua.goit.module9;

public class TextFile extends File {

    public TextFile(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println("Text file '" + name + "' is opened.");
    }
}