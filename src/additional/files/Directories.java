package additional.files;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Directories implements Iterable<String> {

    /**
     * Метод заполняет коллекцию объектами, поля которого содержат информацию об папке или файле в
     * директории (а именно, файл ли это, директория ли это, скрытый ли это файл, в формате ли txt файл).
     *
     * @param directory Директория.
     * @param items     Коллекция для заполнения.
     */
    public static void findItemsFromDirectories(File directory, ArrayList<Something> items) {
        File[] directories = directory.listFiles();
        assert directories != null;
        for (File item : directories) {
            boolean isTxt = false;
            boolean isHidden = false;
            if (item.isDirectory()) {
                items.add(new Something(false, true, false, false));
                findItemsFromDirectories(item, items);
            } else {
                if (item.getName().endsWith(".txt")) {
                    isTxt = true;
                }
                if (item.isHidden()) {
                    isHidden = true;
                }
                items.add(new Something(true, false, isTxt, isHidden));
            }
        }
    }

    /**
     * Метод выводит, сколько в коллекции объектов с полем "isFolder" = true.
     *
     * @param items Коллекция объектов.
     * @return Сколько в коллекции объектов с полем "isFolder" = true.
     */
    public static int quantityFolder(ArrayList<Something> items) {
        int check = 0;
        for (Something item : items) {
            if (item.isFolder()) {
                check++;
            }
        }
        return check;
    }

    /**
     * Метод выводит, сколько в коллекции объектов с полем "isFile" = true.
     *
     * @param items Коллекция объектов.
     * @return Сколько в коллекции объектов с полем "isFile" = true.
     */
    public static int quantityFile(ArrayList<Something> items) {
        int check = 0;
        for (Something item : items) {
            if (item.isFile()) {
                check++;
            }
        }
        return check;
    }

    /**
     * Метод выводит, сколько в коллекции объектов с полем "isHidden" = true.
     *
     * @param items Коллекция объектов.
     * @return Сколько в коллекции объектов с полем "isHidden" = true.
     */
    public static int quantityHidden(ArrayList<Something> items) {
        int check = 0;
        for (Something item : items) {
            if (item.isHidden()) {
                check++;
            }
        }
        return check;
    }

    /**
     * Метод выводит, сколько в коллекции объектов с полем "isTxt" = true.
     *
     * @param items Коллекция объектов.
     * @return Сколько в коллекции объектов с полем "isTxt" = true.
     */
    public static int quantityTxt(ArrayList<Something> items) {
        int check = 0;
        for (Something item : items) {
            if (item.isTxt()) {
                check++;
            }
        }
        return check;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}
