package home_work_6.api;

import home_work_6.RegExSearch;

import java.util.regex.Pattern;

public class SearchEngineCaseNormalizer implements ISearchEngine{

    private ISearchEngine iSearchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine=iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        if(this.iSearchEngine instanceof RegExSearch) {
            word = "(?)"+word.toLowerCase();
            text = "(?)"+text.toLowerCase();
        } else {
            text=text.toLowerCase();
            word=word.toLowerCase();}
        return this.iSearchEngine.search(text, word);
    }
}
