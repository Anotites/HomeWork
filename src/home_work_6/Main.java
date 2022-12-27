package home_work_6;

import java.util.HashSet;

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

        String wordSearch = "он";

        EasySearch easySearch = new EasySearch();
        long resultEasySearch = easySearch.search(name, wordSearch);

        System.out.println("Слово " + wordSearch + " встречается в \""
                + name + "\" " + resultEasySearch + " раз.");

        RegExSearch regExSearch = new RegExSearch();
        long resultRegExSearch = regExSearch.search(name, wordSearch);

        System.out.println("Слово " + wordSearch + " встречается в \"" + name
                + "\" " + resultRegExSearch + " раз.");
    }
}
