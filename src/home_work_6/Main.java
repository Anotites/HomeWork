package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.api.SearchEngineCaseNormalizer;
import home_work_6.api.SearchEnginePunctuationNormalizer;

import java.util.HashSet;

import static home_work_6.WarAndPeace.readBook;

public class Main {
    public static void main(String[] args) {
        String name = "src/home_work_6/WarAndPeace_Book.txt";
        WarAndPeace warAndPeace = new WarAndPeace(new HashSet<>());
        warAndPeace.makeSetCollectionFromText(name);
        int resultSet = warAndPeace.countSetCollectionFromText(name);
        int resultList = warAndPeace.countListCollectionFromText(name);

        System.out.println("Количество уникальных слов в тексте равно: " + resultSet);
        System.out.println("Количество слов в тексте равно: " + resultList);
//        System.out.println("Все уникальные слова: "+warAndPeace.readCollectionFromText());
//        System.out.println("Все уникальные слова в алфавитном порядке: "+warAndPeace.sortAlphabet());

        String resultMap = warAndPeace.makeMapCollectionFromText(name, 6);
        System.out.println("Топ слов: " + resultMap);

        String wordSearch1 = "война";
        String wordSearch2 = "и";
        String wordSearch3 = "мир";

        String text = readBook(name);

        ISearchEngine easySearch = new EasySearch();
        long resultEasySearch1 = easySearch.search(text, wordSearch1);
        long resultEasySearch2 = easySearch.search(text, wordSearch2);
        long resultEasySearch3 = easySearch.search(text, wordSearch3);

        System.out.println("Слово " + wordSearch1 + " встречается в \""
                + name + "\" " + resultEasySearch1 +" раз, cлово " + wordSearch2 +
                " - " + resultEasySearch2 + " раза, cлово " + wordSearch3 +
                " - " + resultEasySearch3 +" раза при помощи EasySearch.");

        ISearchEngine regExSearch = new RegExSearch();
        long resultRegExSearch1 = regExSearch.search(text, wordSearch1);
        long resultRegExSearch2 = regExSearch.search(text, wordSearch2);
        long resultRegExSearch3 = regExSearch.search(text, wordSearch3);

        System.out.println("Слово " + wordSearch1 + " встречается в \""
                + name + "\" " + resultRegExSearch1 +" раз, cлово " + wordSearch2 +
                " - " + resultRegExSearch2 + " раза, cлово " + wordSearch3 +
                " - " + resultRegExSearch3 +" раза при помощи RegExSearch.");

        ISearchEngine searchEnginePunctuationNormalizer1 = new SearchEnginePunctuationNormalizer(easySearch);
        long resultPunctuationNormalizer11 = searchEnginePunctuationNormalizer1.search(text, wordSearch1);
        long resultPunctuationNormalizer12 = searchEnginePunctuationNormalizer1.search(text, wordSearch2);
        long resultPunctuationNormalizer13 = searchEnginePunctuationNormalizer1.search(text, wordSearch3);

        System.out.println("Слово " + wordSearch1 + " встречается в \""
                + name + "\" " + resultPunctuationNormalizer11 +" раз, cлово " + wordSearch2 +
                " - " + resultPunctuationNormalizer12 + " раза, cлово " + wordSearch3 +
                " - " + resultPunctuationNormalizer13 +" раза при помощи EasySearch и SearchEnginePunctuationNormalizer.");

        ISearchEngine searchEnginePunctuationNormalizer2 = new SearchEnginePunctuationNormalizer(regExSearch);
        long resultPunctuationNormalizer21 = searchEnginePunctuationNormalizer2.search(text, wordSearch1);
        long resultPunctuationNormalizer22 = searchEnginePunctuationNormalizer2.search(text, wordSearch2);
        long resultPunctuationNormalizer23 = searchEnginePunctuationNormalizer2.search(text, wordSearch3);

        System.out.println("Слово " + wordSearch1 + " встречается в \""
                + name + "\" " + resultPunctuationNormalizer21 +" раз, cлово " + wordSearch2 +
                " - " + resultPunctuationNormalizer22 + " раза, cлово " + wordSearch3 +
                " - " + resultPunctuationNormalizer23 +" раза при помощи RegExSearch и SearchEnginePunctuationNormalizer.");

        ISearchEngine searchEngineCaseNormalizer1 = new SearchEngineCaseNormalizer(easySearch);
        long resultCaseNormalizer11 = searchEngineCaseNormalizer1.search(text, wordSearch1);
        long resultCaseNormalizer12 = searchEngineCaseNormalizer1.search(text, wordSearch2);
        long resultCaseNormalizer13 = searchEngineCaseNormalizer1.search(text, wordSearch3);

        System.out.println("Слово " + wordSearch1 + " встречается в \""
                + name + "\" " + resultCaseNormalizer11 +" раз, cлово " + wordSearch2 +
                " - " + resultCaseNormalizer12 + " раза, cлово " + wordSearch3 +
                " - " + resultCaseNormalizer13 +" раза вне зависимости от регистра при помощи EasySearch и searchEngineCaseNormalizer.");

        ISearchEngine searchEngineCaseNormalizer2 = new SearchEngineCaseNormalizer(regExSearch);
        long resultCaseNormalizer21 = searchEngineCaseNormalizer2.search(text, wordSearch1);
        long resultCaseNormalizer22 = searchEngineCaseNormalizer2.search(text, wordSearch2);
        long resultCaseNormalizer23 = searchEngineCaseNormalizer2.search(text, wordSearch3);

        System.out.println("Слово " + wordSearch1 + " встречается в \""
                + name + "\" " + resultCaseNormalizer21 +" раз, cлово " + wordSearch2 +
                " - " + resultCaseNormalizer22 + " раза, cлово " + wordSearch3 +
                " - " + resultCaseNormalizer23 +" раза вне зависимости от регистра при помощи RegExSearch и searchEngineCaseNormalizer.");
    }
}
