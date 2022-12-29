package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile("[:\\.)(,!\";\\r<\\n\\s\\t\\?]"+ word + "[:\\.)(,!\";\\r<\\n\\s\\t\\?]");
        Matcher matcher = pattern.matcher(text.replaceAll("\\?", ""));

        long quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        return quantity;
    }
}
