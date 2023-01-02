package home_work_6.book;

import home_work_6.EasySearch;
import home_work_6.api.ISearchEngine;
import home_work_6.api.SearchEngineCapitalLetterNormalizer;
import home_work_6.api.SearchEnginePunctuationNormalizer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import static home_work_6.WarAndPeace.readBook;
import static home_work_6.book.Scanner.scanner;

public class Main {
    public static void main(String[] args) {
        String file = "src/home_work_6/book/books";
        File directory = new File(file);
        Directories directories = new Directories();
        directories.fillItemsFromDirectories(directory);
        choice(directories, file);
    }

    /**
     * Метод, который позволяет в определенной директории выбрать файл (список выводится пользователю).
     * Пользователь, выбрав файл, вводит слово, что он хочет найти в этом файле.
     * После каждого ввода осуществляется поиск.
     * Пользователь может вернуться к выбору файла.
     * Результат всех его поисков накапливается в файле result.txt в формате
     * «Имя файла – слово – количество».
     *
     * @param directories Директория.
     * @param file        Имя директории.
     */
    public static void choice(Directories directories, String file) {
        String choiceBook = "+";
        String bookInitial;
        String word;
        String text;
        long result;
        StringBuilder resultString = new StringBuilder();

        while (Objects.equals(choiceBook, "+")) {
            String books = directories.readCollection();
            System.out.println("Количество книг в формате txt в директории = " + directories.quantityTxt());
            System.out.println("Список книг в формате txt в директории: " + books);
            System.out.println("Какую книгу вы выбираете?");
            bookInitial = scanner();
            String book = file + "/" + bookInitial;
            text = readBook(book);
            System.out.println("Проверять ли слово с учетом регистра? Введите +, " +
                    "если слово нужно искать с учетом регистра.");
            String choiceCase = scanner();
            ISearchEngine easySearch = new EasySearch();

            System.out.println("Какое слово вы хотите проверить?");
            String choiceWord = "+";
            while (Objects.equals(choiceWord, "+")) {
                word = scanner();
                ISearchEngine searchHelper;
                if (Objects.equals(choiceCase, "+")) {
                    searchHelper = new SearchEnginePunctuationNormalizer(easySearch);
                } else {
                    searchHelper = new SearchEngineCapitalLetterNormalizer(easySearch);
                }
                result = searchHelper.search(text, word);

                System.out.println("Слово " + word + " встречается в \""
                        + bookInitial + "\" " + result + " раз.");
                resultString.append("\n").append(bookInitial).append(" - ").append(word).append(" - ").append(result).append(";");

                System.out.println("Продолжать? Введите +, если продолжать. Введите -, если вы хотите " +
                        "вернуть к выбору книги.");
                choiceWord = scanner();
            }
            System.out.println("Хотите выбрать новую книгу? Введите +, если да.");
            choiceBook = scanner();
        }
        writeText(resultString.toString());
    }

    /**
     * Метод, который записывает данные в файл result.txt (для этого создает этот файл).
     *
     * @param text Текст для записи.
     */
    public static void writeText(String text) {
        try (FileWriter writer = new FileWriter("result.txt", false)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

