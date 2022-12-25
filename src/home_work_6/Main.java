package home_work_6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WarAndPeace warAndPeace = new WarAndPeace(new HashSet<>());
        int resultSet = warAndPeace.makeSetCollectionFromText("Война и мир_книга.txt");
        System.out.println("Количество уникальных слов в тексте равно: "+resultSet);
//        System.out.println("Все уникальные слова: "+warAndPeace.readCollectionFromText());
//        System.out.println("Все уникальные слова в алфавитном порядке: "+warAndPeace.sortAlphabet());

        String resultMap = warAndPeace.makeMapCollectionFromText("Война и мир_книга.txt",5);
        System.out.println("Топ слов: "+resultMap);



    }
}
