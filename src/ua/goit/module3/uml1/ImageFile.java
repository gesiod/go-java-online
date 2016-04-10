package ua.goit.module3.uml1;

public class ImageFile extends File {

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Image file '" + name + "' is opened.");
    }
}