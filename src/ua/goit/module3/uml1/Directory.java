package ua.goit.module3.uml1;

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