package ua.goit.module6.task2.module3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MusicShop {

    // Instruments
    private List<Instrument> instruments;

    // Set instruments
    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public String toString() {
        return "MusicShop instruments = " + instruments + "\n";
    }

    // Prepare list of instruments to remove
    public List<Instrument> prepareInstruments(Map<String, Integer> order) throws NoSuchInstrumentException, IllegalArgumentException {

        // Check if no such instruments in music shop
        for (String instrument : order.keySet()) {
            if (instrument != "piano" && instrument != "guitar" && instrument != "trumpet") {
                throw new NoSuchInstrumentException("[Error]: No such instrument as '" + instrument + "' in Music Shop.");
            }
        }
        // Check if number of instruments is 0 or negative
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            if (entry.getValue() < 0) {
                throw new IllegalArgumentException("[Error]: Negative number (" + entry.getValue() + ") of " + entry.getKey() + "s");
            }
            if (entry.getValue() == 0) {
                throw new IllegalArgumentException("[Error]: Zero number of " + entry.getKey() + "s");
            }
        }
        // Create list of order instruments present in music shop
        List<Instrument> orderInstrumentsFoundInShop = new ArrayList<>();
        // Prepare list of order instruments present in music shop
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            // Get instrument and number
            String orderInstrument = orderEntry.getKey();
            Integer orderInstrumentNumber = orderEntry.getValue();
            // Create removed counter
            int numberOfFoundInstruments = 0;
            // Fill the list with existent instruments
            for (Instrument musicShopInstrument : instruments) {
                if (musicShopInstrument.getType().equals(orderInstrument) && numberOfFoundInstruments < orderInstrumentNumber) {
                    orderInstrumentsFoundInShop.add(musicShopInstrument);
                    numberOfFoundInstruments++;
                }
            }
            if (numberOfFoundInstruments < orderInstrumentNumber) {
                throw new IllegalArgumentException("[Error]: Not enough '" + orderInstrument + "s' in music shop. \n");
            }
        }

        // Return the list of instruments to remove
        return orderInstrumentsFoundInShop;
    }

    // Remove instruments from music shop
    public void removeOrderedInstrumentsFromMusicShop(Map<String, Integer> order) {
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            // Get instrument type and number
            String orderInstrument = orderEntry.getKey();
            Integer orderInstrumentNumber = orderEntry.getValue();
            // Create removed counter
            int numberOfInstrumentsRemoved = 0;
            // Remove instruments of current type form Music Shop
            Iterator<Instrument> iterator = instruments.iterator();
            while (iterator.hasNext()) {
                Instrument musicShopInstrument = iterator.next();
                if (musicShopInstrument.getType().equals(orderInstrument) && numberOfInstrumentsRemoved < orderInstrumentNumber) {
                    iterator.remove();
                    numberOfInstrumentsRemoved++;
                }
            }
        }
    }

    // Execute order
    public void executeOrder(Map<String, Integer> order) {
        try {
            System.out.println("Order instruments = " + prepareInstruments(order) + "\n");
            removeOrderedInstrumentsFromMusicShop(order);
        } catch (NoSuchInstrumentException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}