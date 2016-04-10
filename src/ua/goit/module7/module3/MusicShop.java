package ua.goit.module7.module3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MusicShop {

    // Music shop instruments
    private List<Instrument> instruments;

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void printShopInstruments() {
        int pianos = 0;
        int guitars = 0;
        int trumpets = 0;
        for (Instrument instrument : instruments) {
            if (instrument.getType().equals("piano")) {
                pianos++;
            } else if (instrument.getType().equals("guitar")) {
                guitars++;
            } else if (instrument.getType().equals("trumpet")) {
                trumpets++;
            }
        }
        System.out.println("Shop instruments: " + "Pianos(" + pianos + "), Guitars(" + guitars + "), Trumpets(" + trumpets + ")");
    }

    public void printOrder(Map<String, Integer> order1) {
        String order = "Order instruments: ";
        for (Map.Entry<String, Integer> entry : order1.entrySet()) {
            String instrumentName = entry.getKey();
            Integer number = entry.getValue();
            String capitalizedInstrumentName = instrumentName.substring(0, 1).toUpperCase() + instrumentName.substring(1);
            order += capitalizedInstrumentName + "s(" + number + ") ";
        }
        System.out.println(order);
    }

    public void executeOrder(Map<String, Integer> order) {
        String status = "Order not executed!\n";
        try {
            prepareInstruments(order);
            removeOrderedInstrumentsFromMusicShop(order);
            status = "Order executed!\n";
        } catch (NoSuchInstrumentException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(status);
        }
    }

    public void prepareInstruments(Map<String, Integer> order) throws NoSuchInstrumentException, IllegalArgumentException {
        // Create list of order instruments (present in music shop)
        List<Instrument> orderInstrumentsFoundInShop = new ArrayList<>();
        // Fill the list of order instruments (present in music shop)
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            // Get instrument and number
            String orderInstrument = orderEntry.getKey();
            Integer orderInstrumentNum = orderEntry.getValue();
            // Check instrument and number
            Validation.checkInstrumentAndNumber(orderInstrument, orderInstrumentNum);
            // Create found instruments counter
            int numberOfFoundInstruments = 0;
            // Fill the list with existent instruments
            for (Instrument shopInstrument : instruments) {
                if (shopInstrument.getType().equals(orderInstrument) && numberOfFoundInstruments < orderInstrumentNum) {
                    orderInstrumentsFoundInShop.add(shopInstrument);
                    numberOfFoundInstruments++;
                }
            }
            if (numberOfFoundInstruments < orderInstrumentNum) {
                throw new IllegalArgumentException("[Error]: Not enough '" + orderInstrument + "s' in music shop.");
            }
        }
    }

    public void removeOrderedInstrumentsFromMusicShop(Map<String, Integer> order) {
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            // Create removed counter
            int numberOfInstrumentsRemoved = 0;
            // Remove instruments of current type from Music Shop
            Iterator<Instrument> iterator = instruments.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getType().equals(orderEntry.getKey()) &&
                        numberOfInstrumentsRemoved < orderEntry.getValue()) {
                    iterator.remove();
                    numberOfInstrumentsRemoved++;
                }
            }
        }
    }
}