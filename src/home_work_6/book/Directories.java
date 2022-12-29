package home_work_6.book;

import java.io.File;
import java.util.*;
import java.util.function.Consumer;

public class Directories implements Iterable<String> {

    List<Book> items;

    public Directories() {
        this.items = new ArrayList<>();
    }

    /**
     * Метод заполняет коллекцию объектами, поля которого содержат информацию об папке или файле в
     * директории (а именно, файл ли это, директория ли это, скрытый ли это файл, в формате ли txt файл).
     *
     * @param directory Директория.
     */
    public void fillItemsFromDirectories(File directory) {
        File[] directories = directory.listFiles();
        assert directories != null;
        for (File item : directories) {
            if (item.isDirectory()) {
                fillItemsFromDirectories(item);
            } else {
                if (item.getName().endsWith(".txt")) {
                    this.items.add(new Book(item.getName()));
                }
            }
        }
    }

    /**
     * Метод выводит, сколько в коллекции объектов с полем "isTxt" = true.
     *
     * @return Сколько в коллекции объектов с полем "isTxt" = true.
     */
    public int quantityTxt() {
        return this.items.size();
    }

    public String readCollection() {
        StringBuilder allBooks= new StringBuilder();
        for (Book book:this.items) {
            allBooks.append(book.getName()).append("; ");
        }
        return allBooks.toString();
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
