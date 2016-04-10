package ua.goit.module7.module3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Create Music shop with instruments
        MusicShop musicShop = new MusicShop();
        musicShop.setInstruments(createInstruments(2, 16, 7));

        // Create order 1
        Map<String, Integer> order1 = new HashMap<>();
        order1.put("hguitar", 7);
        order1.put("trumpet", 2);
        // Create order 2
        Map<String, Integer> order2 = new HashMap<>();
        order2.put("piano", 1);
        // Create order 3
        Map<String, Integer> order3 = new HashMap<>();
        order3.put("piano", 1);
        order3.put("guitar", 8);
        order3.put("trumpet", 6);

        // Execute order 1
        musicShop.printShopInstruments();
        musicShop.printOrder(order1);
        musicShop.executeOrder(order1);
        // Execute order 2
        musicShop.printShopInstruments();
        musicShop.printOrder(order2);
        musicShop.executeOrder(order2);
        // Execute order 3
        musicShop.printShopInstruments();
        musicShop.printOrder(order3);
        musicShop.executeOrder(order3);

        musicShop.printShopInstruments();
    }

    public static ArrayList<Instrument> createInstruments(Integer numOfPianos, Integer numOfGuitars, Integer numOfTrumpets) {
        // Create list of instruments
        ArrayList<Instrument> instruments = new ArrayList<>();
        // Add instruments to list
        for (int i = 0; i < numOfPianos; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < numOfGuitars; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < numOfTrumpets; i++) {
            instruments.add(new Trumpet());
        }

        return instruments;
    }
}