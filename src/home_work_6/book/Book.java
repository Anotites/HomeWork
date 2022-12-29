package home_work_6.book;

public class Something {
    public boolean isFolder;
    public boolean isTxt;

    public Something(boolean isFolder, boolean isTxt) {
        this.isFolder = isFolder;
        this.isTxt = isTxt;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public boolean isTxt() {
        return isTxt;
    }
}
