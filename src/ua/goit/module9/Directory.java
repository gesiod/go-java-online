package ua.goit.module9;

import java.util.ArrayList;

public class Directory {

    // Files in directory
    private ArrayList<File> files;

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<File> getFiles() {
        return files;
    }
}