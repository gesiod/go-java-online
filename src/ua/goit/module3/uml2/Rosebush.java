package ua.goit.module3.uml2;

import java.util.ArrayList;

public class Rosebush {

    private ArrayList<Rose> roses;

    public Rosebush(ArrayList<Rose> roses) {
        this.roses = roses;
    }

    public ArrayList<Rose> getRoses() {
        return roses;
    }
}