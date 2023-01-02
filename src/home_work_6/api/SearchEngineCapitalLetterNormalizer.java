package home_work_6.api;

import home_work_6.RegExSearch;

public class SearchEngineCapitalLetterNormalizer implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public SearchEngineCapitalLetterNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    /**
     * Метод-декоратор, который выводит, сколько раз встречается в тексте слово
     * (без учета регистра, с учетом падежа).
     *
     * @param text Текст, в котором производится поиск.
     * @param word Слово, которое ищут.
     * @return Сколько раз слово встречается в тексте.
     */
    @Override
    public long search(String text, String word) {
        if (this.iSearchEngine instanceof RegExSearch) {
            word = "(?)" + word.toLowerCase();
            text = "(?)" + text.toLowerCase();
        } else {
            text = text.toLowerCase();
            word = word.toLowerCase();
        }
        return this.iSearchEngine.search(text, word);
    }
}
