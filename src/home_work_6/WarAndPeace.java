package home_work_6;

import home_work_6.api.ComparatorAlphabet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class WarAndPeace implements Iterable<String> {

    private Set<String> resultSet;
    private static final String stringCanBeSeparatedBy =
            "([<>=\"#\\[$;%&':)(*+,!./@\\]^_`{|}~])|(\\?[^a-zA-ZА-Яа-я0-9])|(-\\s)|(\\s-)|(\\s)|(--)";

    public WarAndPeace(Set<String> resultSet) {
        this.resultSet = resultSet;
    }

    /**
     * Метод, который позволяет прочитать текстовый файл
     * и поместить текст из данного текстового файла в строку.
     *
     * @param nameOfFile Имя файла.
     * @return Строка, содержащая всю текстовую информацию из файла.
     */
    public static String readBook(String nameOfFile) {
        String text = "";
        try (BufferedReader reader
                     = new BufferedReader(
                new FileReader(nameOfFile)
        )
        ) {
            StringBuilder builder = new StringBuilder();
            String data;
            while ((data = reader.readLine()) != null) {
                builder.append(data).append(" ");
            }
            text = builder.toString();
        } catch (FileNotFoundException e1) {
            System.out.println("Файл не найден: " + e1.getMessage());
        } catch (IOException e2) {
            System.out.println("Произошла ошибка при чтении файла: " + e2.getMessage());
        }
        return text;
    }

    /**
     * Метод, который все слова из строки, полученной из метода readBook, помещает в коллекцию Set.
     * Получается список уникальных слов.
     *
     * @param nameOfFile Имя файла, из которого читается строка.
     */
    public void makeSetCollectionFromText(String nameOfFile) {
        String toInsert = readBook(nameOfFile);
        for (String word : toInsert.split(stringCanBeSeparatedBy)) {
            if (!word.isEmpty()) {
                if (word.contains("?")) {
                    word = word.replaceAll("\\?", "");
                }
                this.resultSet.add(word);
            }
        }
    }

    /**
     * Метод, выводит количество всех слов из строки, полученной из метода readBook, помещенных в коллекцию
     * Set. Список слов уникальный.
     *
     * @return Количество слов.
     */
    public int countSetCollectionFromText() {
        return resultSet.size();
    }

    /**
     * Метод, выводит количество всех слов из строки, полученной из метода readBook, помещенных в коллекцию
     * List. Список слов не уникальный.
     *
     * @param nameOfFile Имя файла, из которого читается строка.
     * @return Количество слов.
     */
    public int countListCollectionFromText(String nameOfFile) {
        return makeListCollectionFromText(nameOfFile).size();
    }

    /**
     * Метод, который все слова из строки, полученной из метода readBook, помещает в коллекцию List.
     * Получается список всех использованных слов (с повторением).
     *
     * @param nameOfFile Имя файла, из которого читается строка.
     * @return Коллекция со всеми словами.
     */
    public List<String> makeListCollectionFromText(String nameOfFile) {
        List<String> resultList = new ArrayList<>();
        String toInsert = readBook(nameOfFile);
        for (String word : toInsert.split(stringCanBeSeparatedBy)) {
            if (!word.isEmpty()) {
                if (word.contains("?")) {
                    word = word.replaceAll("\\?", "");
                }
                resultList.add(word);
            }
        }
        return resultList;
    }

    /**
     * Метод, который создает коллекцию Map из коллекции List. Key - уникальное слово. Value - количество
     * повторений.
     *
     * @param nameOfFile Имя файла, из которого читается строка.
     * @param top        Сколько слов должно быть в топе.
     * @return Строка, которая содержит информацию о самых популярных словах и их количестве.
     */
    public String makeMapCollectionFromText(String nameOfFile, int top) {
        List<String> resultList = makeListCollectionFromText(nameOfFile);

        Map<String, Integer> resultMap = new HashMap<>();
        for (String item1 : resultList) {
            if (resultMap.containsKey(item1)) {
                resultMap.put(item1, resultMap.get(item1) + 1);
            } else {
                resultMap.put(item1, 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(resultMap.entrySet());

        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        StringBuilder sortResult = new StringBuilder();
        for (int i = 0; i < top; i++) {
            sortResult.append(entryList.get(i).getKey()).append(" - ").append(entryList.get(i).getValue()).append("; ");
        }
        return sortResult.toString();
    }

    /**
     * Метод выводит коллекцию Set со всеми уникальными словами.
     *
     * @return Коллекция Set со всеми уникальными словами.
     */
    public Set<String> readCollectionFromText() {
        return this.resultSet;
    }

    /**
     * Метод выводит коллекцию List со всеми уникальными словами в алфавитном порядке.
     *
     * @return Коллекция List со всеми уникальными словами в алфавитном порядке.
     */
    public List<String> sortAlphabet() {
        List<String> sortList = new ArrayList<>(this.resultSet);
        sortList.sort(new ComparatorAlphabet());
        return sortList;
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


