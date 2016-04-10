package ua.goit.module9;

import java.util.Collection;

public class PrintCollection {

    public static void print(Collection<File> files) {
        System.out.println("");
        System.out.printf("%-15s%7s%n", "File name", "Size");
        System.out.println("_______________________");
        files.stream().forEach(file -> System.out.printf("%-15s%5d%n", file.getName(), file.getSize()));
    }
}