package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.api.SearchEnginePunctuationNormalizer;

import java.util.HashSet;

import static home_work_6.WarAndPeace.readWarAndPeace;

public class Main {
    public static void main(String[] args) {
        String name = "Война и мир_книга.txt";
        WarAndPeace warAndPeace = new WarAndPeace(new HashSet<>());
        int resultSet = warAndPeace.makeSetCollectionFromText(name);
        int resultList = warAndPeace.makeListCollectionFromText(name);

        System.out.println("Количество уникальных слов в тексте равно: " + resultSet);
        System.out.println("Количество слов в тексте равно: " + resultList);
//        System.out.println("Все уникальные слова: "+warAndPeace.readCollectionFromText());
//        System.out.println("Все уникальные слова в алфавитном порядке: "+warAndPeace.sortAlphabet());

        String resultMap = warAndPeace.makeMapCollectionFromText(name, 5);
        System.out.println("Топ слов: " + resultMap);

        String wordSearch = "мир";
        String text = readWarAndPeace(name);

        ISearchEngine easySearch = new EasySearch();
        long resultEasySearch = easySearch.search(text, wordSearch);

        System.out.println("Слово " + wordSearch + " встречается в \""
                + name + "\" " + resultEasySearch + " раз.");

        ISearchEngine regExSearch = new RegExSearch();
        long resultRegExSearch = regExSearch.search(text, wordSearch);

        System.out.println("Слово " + wordSearch + " встречается в \"" + name
                + "\" " + resultRegExSearch + " раз.");

        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);
        long resultPunctuationNormalizer = searchEnginePunctuationNormalizer.search(text, wordSearch);

        System.out.println("Слово " + wordSearch + " встречается в \"" + name
                + "\" " + resultPunctuationNormalizer + " раз.");

    }
}
