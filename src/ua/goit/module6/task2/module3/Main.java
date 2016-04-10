package ua.goit.module6.task2.module3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Create music shop
        MusicShop musicShop = new MusicShop();

        // Create instruments
        ArrayList<Instrument> instruments = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < 16; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 7; i++) {
            instruments.add(new Trumpet());
        }

        // Add instruments to music shop
        musicShop.setInstruments(instruments);

        // Create orders 1
        Map<String, Integer> order1 = new HashMap<>();
        order1.put("guitar", 7);
        order1.put("trumpet", 2);

        // Create orders 2
        Map<String, Integer> order2 = new HashMap<>();
        order2.put("piano", 1);

        // Create orders 3
        Map<String, Integer> order3 = new HashMap<>();
        order3.put("piano", 1);
        order3.put("guitar", 8);
        order3.put("trumpet", 6);

        System.out.println(musicShop);

        // Execute orders
        musicShop.executeOrder(order1);
        musicShop.executeOrder(order2);
        musicShop.executeOrder(order3);

        System.out.println(musicShop);
    }
}