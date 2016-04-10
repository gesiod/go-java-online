package ua.goit.module8;

public abstract class File implements Comparable<File> {

    // File name
    protected String name;
    protected Integer size;

    @Override
    public String toString() {
        return name + " " + size;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public int compareTo(File file) {
        int nameCompareResult = this.name.compareTo(file.name);
        if (nameCompareResult != 0) {
            return nameCompareResult;
        }
        int sizeCompareResult = this.size - file.size;
        if (sizeCompareResult != 0) {
            return sizeCompareResult;
        }

        return 0;
    }

    public abstract void open();
}