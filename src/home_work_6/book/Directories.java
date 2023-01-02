package home_work_6.book;

import java.io.File;
import java.util.*;
import java.util.function.Consumer;

public class Directories implements Iterable<String> {

    private List<Book> items;

    public Directories() {
        this.items = new ArrayList<>();
    }

    /**
     * Метод заполняет коллекцию объектами, соответствующих txt файлам, содержащимся в директории.
     * Объекты будут в поле name содержать название соответствующего txt файла.
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
     * Метод выводит, сколько в коллекции объектов-книг.
     *
     * @return Сколько в коллекции объектов-книг.
     */
    public int quantityTxt() {
        return this.items.size();
    }

    /**
     * Метод, который выводит названия всех книг (выводит данные из поля name объектов Book в коллекции).
     *
     * @return Список книг в коллекции.
     */
    public String readCollection() {
        StringBuilder allBooks = new StringBuilder();
        for (Book book : this.items) {
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
