package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    private final String[] symbols = new String[]{",", " ", ".", "!", "--", ":", ")", "(",
            "\"", "<", ";", "? ", " -", "[", "- "};

    /**
     * Метод, который выводит, сколько раз встречается в тексте слово (при помощи метода indexOf).
     *
     * @param text Текст, в котором производится поиск.
     * @param word Слово, которое ищут.
     * @return Сколько раз слово встречается в тексте.
     */
    @Override
    public long search(String text, String word) {
        String toCheck = text.replace("?", "");

        int position = 2;
        long quantity = 0;
        int start = 0;
        int end;

        if (toCheck.indexOf(word) == 0) {
            for (String lastSymbol : symbols) {
                String newWord = word + lastSymbol;
                end = word.length() + lastSymbol.length();
                String check = toCheck.substring(start, end);
                if (newWord.equals(check)) {
                    quantity = 1;
                    break;
                }
            }
        }

        while (toCheck.indexOf(word, position) != -1) {
            position = toCheck.indexOf(word, position);
            outer:
            for (String firstSymbol : symbols) {
                for (String lastSymbol : symbols) {
                    String newWord = firstSymbol + word + lastSymbol;
                    start = position - firstSymbol.length();
                    end = position + word.length() + lastSymbol.length();
                    if (end >= toCheck.length()) {
                        start = toCheck.length() - 1 - word.length();
                        end = toCheck.length() - 1;
                        if (word.equals(toCheck.substring(start, end))) {
                            quantity++;
                            position = toCheck.length() - 1;
                            break outer;
                        }
                    }
                    String check = toCheck.substring(start, end);
                    if (newWord.equals(check)) {
                        quantity++;
                        position = toCheck.indexOf(word, position) + 1;
                        break outer;
                    }
                }
            }
            position = position + 1;
        }
        return quantity;
    }
}
