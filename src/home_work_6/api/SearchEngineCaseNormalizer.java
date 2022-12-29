package home_work_6.api;

import home_work_6.RegExSearch;

import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer1111 implements ISearchEngine{

    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer1111(ISearchEngine iSearchEngine) {
        this.iSearchEngine=iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        if(this.iSearchEngine instanceof RegExSearch) {
            Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
        } else {
            text=text.toLowerCase();
            word=word.toLowerCase();
        }
        return this.iSearchEngine.search(text, word);
    }
}
