package home_work_6.api;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    private final String[] vowels = new String[]{"а", "я", "ы", "и", "е", "у", "ю", "ой",
            "ей", "ою", "ею", "о", "ом", "ем"};
    private final String[] symbols = new String[]{",", " ", ".", "!", "--", ":", ")", "(",
            "\"", "<", ";", "? ", " -", "[", "- "};

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    /**
     * Метод-декоратор, который выводит, сколько раз встречается в тексте слово (с учетом регистра,
     * без учета падежа).
     * Метод, ищет слова в единственном числе.
     *
     * @param text Текст, в котором производится поиск.
     * @param word Слово, которое ищут.
     * @return Сколько раз слово встречается в тексте.
     */
    @Override
    public long search(String text, String word) {
        if (word.length() != 1) {
            String shortWord = word;
            String newWord;
            for (String vowel : vowels) {
                if (word.endsWith(vowel)) {
                    shortWord = word.substring(0, word.length() - vowel.length());
                    break;
                }
            }
            if (text.contains(shortWord)) {
                for (String vowel : vowels) {
                    newWord = shortWord + vowel;
                    for (String firstSymbol : symbols) {
                        for (String lastSymbol : symbols) {
                            if (text.contains(firstSymbol + newWord + lastSymbol)) {
                                text = text.replaceAll(firstSymbol + newWord + lastSymbol,
                                        firstSymbol + word + lastSymbol);
                            }
                        }
                    }
                }
            }
        }
        return this.iSearchEngine.search(text, word);
    }
}
