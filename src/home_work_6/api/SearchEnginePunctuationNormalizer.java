package home_work_6.api;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    /**
     * Метод-декоратор, который выводит, сколько раз встречается в тексте слово (с учетом регистра,
     * с учетом падежа). Метод убирает из текста нежелательные символы: любые знаки препинания,
     * лишние пробелы и, например, переводы строк.
     *
     * @param text Текст, в котором производится поиск.
     * @param word Слово, которое ищут.
     * @return Сколько раз слово встречается в тексте.
     */
    @Override
    public long search(String text, String word) {
        String textPunctuationNormalizer = text.replaceAll("[:.)(,!\";\\r<\\n\\t]|(\\?\\s)|(\\?\\r)|(\\?\\n)|(--)|(\\s-)|(-\\s)", " ");
        return this.iSearchEngine.search(textPunctuationNormalizer, word);
    }
}
