package ua.goit.module3;

import ua.goit.module3.uml1.*;
import ua.goit.module3.uml2.*;
import ua.goit.module3.uml3.*;
//import uml1.*;
//import uml2.*;
//import uml3.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- uml 1 ---\n");

        // Create & adding files objects to collection
        ArrayList<File> files = new ArrayList<>();
        files.add(new TextFile("Report.doc"));
        files.add(new ImageFile("Kyiv.jpg"));
        files.add(new AudioFile("Ring.mp3"));

        // Adding files to directory
        Directory directory = new Directory();
        directory.setFiles(files);

        // Print directory files
        System.out.println("Directory contains next files:");
        for (File file : directory.getFiles()) {
            System.out.println("- " + file.getName());
        }

        // Opening all files from directory
        for (File file : directory.getFiles()) {
            file.open();
        }


        System.out.println("\n--- uml 2 ---\n");

        // Creating & adding flowers objects to array
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose("Rose"));
        flowers.add(new Chamomile("Chamomile"));
        flowers.add(new Aster("Aster"));
        flowers.add(new Tulip("Tulip"));

        // Creating a flower bouquet
        FlowerBouquet flowerBouquet = new FlowerBouquet(flowers);

        // Printing all flowers from the flower bouquet
        System.out.println("Flower bouquet consist of:");
        for (Flower flower : flowerBouquet.getFlowerBouquet()) {
            System.out.println("- " + flower.getName());
        }
        // Adding roses to array
        ArrayList<Rose> roses = new ArrayList<>();
        roses.add(new Rose("Rose1"));
        roses.add(new Rose("Rose2"));
        roses.add(new Rose("Rose3"));

        // Creating a rosebush
        Rosebush rosebush = new Rosebush(roses);

        // Printing all roses from the rosebush
        System.out.println("Rosebush consist of:");
        for (Rose currentRose : rosebush.getRoses()) {
            System.out.println("- " + currentRose.getName());
        }


        System.out.println("\n--- uml 3 ---\n");

        // Creating array with music instruments
        ArrayList<MusicInstrument> musicInstruments = new ArrayList<>();
        musicInstruments.add(new Guitar("Guitar"));
        musicInstruments.add(new Piano("Piano"));
        musicInstruments.add(new Trumpet("Trumpet"));

        // Setting instruments array to music shop
        MusicShop musicShop = new MusicShop();
        musicShop.setMusicInstrument(musicInstruments);

        // Printing all instruments from music shop
        System.out.println("MusicShop contains next instruments:");
        for (MusicInstrument musicInstrument : musicShop.getMusicInstruments()) {
            System.out.println("- " + musicInstrument.getName());
        }
    }
}