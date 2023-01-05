package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExSearch implements ISearchEngine {

    private static final String stringCanBeSeparatedBy = "[<>=\"#\\s$;\\[%&':)(*+,!./@\\]^_`{|}]";
    private final String[] symbols = new String[]{",", " ", ".", "!", "--", ":", ")", "(",
            "\"", "<", ";", "? ", " -", "[", "- "};

    /**
     * Метод, который выводит, сколько раз встречается в тексте слово (при помощи регулярных выражений).
     *
     * @param text Текст, в котором производится поиск.
     * @param word Слово, которое ищут.
     * @return Сколько раз слово встречается в тексте.
     */
    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile(stringCanBeSeparatedBy + word + stringCanBeSeparatedBy);
        Matcher matcher = pattern.matcher(text.replaceAll("\\?", ""));

        long quantity = 0;
        boolean firstWord = false;
        int wordLength = word.length();
        int textLength = text.length();

        if (wordLength == textLength && text.indexOf(word) == 0) {
            quantity = 1;
        } else {
            if (text.indexOf(word) == 0) {
                for (String lastSymbol : symbols) {
                    String newWord = word + lastSymbol;
                    int end = wordLength + lastSymbol.length();
                    String check = text.substring(0, end);
                    if (newWord.equals(check)) {
                        quantity = 1;
                        firstWord = true;
                        break;
                    }
                }
            }

            while (matcher.find()) {
                quantity++;
            }

            Pattern pattern11 = Pattern.compile("(\s-)" + word + stringCanBeSeparatedBy);
            Matcher matcher11 = pattern11.matcher(text.replaceAll("\\?", ""));

            while (matcher11.find()) {
                quantity++;
            }

            Pattern pattern12 = Pattern.compile("(\s-)" + word + "$");
            Matcher matcher12 = pattern12.matcher(text.replaceAll("\\?", ""));

            while (matcher12.find()) {
                quantity++;
            }

            Pattern pattern2 = Pattern.compile(stringCanBeSeparatedBy + word + "(-\s)");
            Matcher matcher2 = pattern2.matcher(text.replaceAll("\\?", ""));

            while (matcher2.find()) {
                quantity++;
            }

            Pattern pattern3 = Pattern.compile(stringCanBeSeparatedBy + word + "$");
            Matcher matcher3 = pattern3.matcher(text.replaceAll("\\?", ""));

            while (matcher3.find()) {
                quantity++;
            }

            if (firstWord) {
                if (quantity != 1) {
                    quantity = quantity - 1;
                }
            }
        }
        return quantity;
    }
}

