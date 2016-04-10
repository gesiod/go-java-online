package ua.goit.module3.uml2;

import java.util.ArrayList;

public class FlowerBouquet {

    private ArrayList<Flower> flowerBouquet;

    public FlowerBouquet(ArrayList<Flower> flowers) {
        this.flowerBouquet = flowers;
    }

    public ArrayList<Flower> getFlowerBouquet() {
        return flowerBouquet;
    }
}