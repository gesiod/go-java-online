package ua.goit.module8;

public class ImageFile extends File {

    public ImageFile(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println("Image file '" + name + "' is opened.");
    }
}