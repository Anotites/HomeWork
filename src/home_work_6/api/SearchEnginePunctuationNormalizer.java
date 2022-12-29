package home_work_6.api;

public class SearchEnginePunctuationNormalizer implements ISearchEngine{

    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine=iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        String textPunctuationNormalizer = text.replaceAll("[:\\.)(,!\";\\r<\\n]|(\\?\\s)|(\\?\\r)|(\\?\\n)|(--)|(\\s-)|(-\\s)", " ");
        return this.iSearchEngine.search(textPunctuationNormalizer, word);
    }
}
