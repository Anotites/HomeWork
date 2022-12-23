package additional.files;

public class Something {
    public boolean isFile;
    public boolean isFolder;
    public boolean isTxt;
    public boolean isHidden;

    public Something(boolean isFile, boolean isFolder, boolean isTxt, boolean isHidden) {
        this.isFile = isFile;
        this.isFolder = isFolder;
        this.isTxt = isTxt;
        this.isHidden = isHidden;
    }

    public boolean isFile() {
        return isFile;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public boolean isTxt() {
        return isTxt;
    }

    public boolean isHidden() {
        return isHidden;
    }
}
