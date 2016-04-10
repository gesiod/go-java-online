package ua.goit.module8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Task 1
        List<File> files = new ArrayList<>();
        files.add(new TextFile("Document.txt", 30));
        files.add(new ImageFile("Phoro.jpg", 10));
        files.add(new AudioFile("Audio.mp3", 45));

        PrintCollection.print(files);

        // Task 2
        SortedSet<File> myFiles = new TreeSet<>();
        isFuture(myFiles);
        myFiles.add(new TextFile("Abandon", 70));
        myFiles.add(new TextFile("Burn", 10));
        myFiles.add(new TextFile("Abandon", 30));

        PrintCollection.print(myFiles);
        System.out.println("");

        // Additional solution examples

        // Sort1
        Collections.sort(files);

        // Sort2
        Collections.sort(files, new FileComparator());

        // Sort3
        Comparator<File> comparator = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getSize() - o2.getSize();
            }
        };
        Collections.sort(files, comparator);

        // Sort4
        Comparator<File> comparator2 = (o1, o2) -> o1.getSize() - o2.getSize();
        Collections.sort(files, comparator2);

        // Sort5
        Collections.sort(files, (o1, o2) -> o1.getSize() - o2.getSize());

        // Sort6
        Collections.sort(files, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        // Sort7
        Collections.sort(files, (o1, o2) -> {
            int result = o1.getSize() - o2.getSize();
            System.out.println(result);
            return result;
        });

        PrintCollection.print(files);
    }

    private static boolean isFuture(SortedSet<File> myFiles) {
        return myFiles.add(new TextFile("Future", 50));
    }
}