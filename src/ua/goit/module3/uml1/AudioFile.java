package ua.goit.module3.uml1;

public class AudioFile extends File {

    public AudioFile(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Audio file '" + name + "' is opened.");
    }
}