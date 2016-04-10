package ua.goit.module8;

import java.util.Comparator;

public class FileComparator implements Comparator<File> {
    @Override
    public int compare(File file1, File file2) {
        return file1.getSize() - file2.getSize();
    }
}
