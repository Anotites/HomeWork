package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static home_work_6.WarAndPeace.readWarAndPeace;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        String toInsert = readWarAndPeace(text);
        Pattern pattern = Pattern.compile("[:\\.)(,!\";<\\s]"+word+"[:\\.)(,!\";<\\s]");
        Matcher matcher = pattern.matcher(toInsert);

        long quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }
}
