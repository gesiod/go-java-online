package ua.goit.module9;

public class AudioFile extends File {

    public AudioFile(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println("Audio file '" + name + "' is opened.");
    }
}