package home_work_4.home_work_6;

import home_work_6.EasySearch;
import home_work_6.RegExSearch;
import home_work_6.api.ISearchEngine;
import home_work_6.api.SearchEngineCapitalLetterNormalizer;
import home_work_6.api.SearchEngineCaseNormalizer;
import home_work_6.api.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISearchEngineTest {

    ISearchEngine easySearch = new EasySearch();
    ISearchEngine regExSearch = new RegExSearch();
    ISearchEngine searchEnginePunctuationNormalizer1 = new SearchEnginePunctuationNormalizer(easySearch);
    ISearchEngine searchEnginePunctuationNormalizer2 = new SearchEnginePunctuationNormalizer(regExSearch);
    ISearchEngine searchEngineCaseNormalizer1 = new SearchEngineCapitalLetterNormalizer(easySearch);
    ISearchEngine searchEngineCaseNormalizer2 = new SearchEngineCapitalLetterNormalizer(regExSearch);
    ISearchEngine searchEngineNormalizer1 = new SearchEngineCaseNormalizer(easySearch);
    ISearchEngine searchEngineNormalizer2 = new SearchEngineCaseNormalizer(regExSearch);

    String word1 = "мыл";
    String text1 = "Мама мыла раму";

    @Test
    public void test11() {
        Assertions.assertEquals(0, easySearch.search(text1, word1));
    }

    @Test
    public void test12() {
        Assertions.assertEquals(0, regExSearch.search(text1, word1));
    }

    @Test
    public void test13() {
        Assertions.assertEquals(0, searchEnginePunctuationNormalizer1.search(text1, word1));
    }

    @Test
    public void test14() {
        Assertions.assertEquals(0, searchEnginePunctuationNormalizer2.search(text1, word1));
    }

    @Test
    public void test15() {
        Assertions.assertEquals(0, searchEngineCaseNormalizer1.search(text1, word1));
    }

    @Test
    public void test16() {
        Assertions.assertEquals(0, searchEngineCaseNormalizer2.search(text1, word1));
    }

    String word21 = "привет";
    String word22 = "Привет";
    String word23 = "как";
    String text2 = "Ну привет, как дела! привет,какдела! привет;какдела! " +
            "как дела!.Что делаешь? Привет-привет Привет ,привет.";

    @Test
    public void test211() {
        Assertions.assertEquals(4, easySearch.search(text2, word21));
    }

    @Test
    public void test221() {
        Assertions.assertEquals(1, easySearch.search(text2, word22));
    }

    @Test
    public void test231() {
        Assertions.assertEquals(2, easySearch.search(text2, word23));
    }

    @Test
    public void test212() {
        Assertions.assertEquals(4, regExSearch.search(text2, word21));
    }

    @Test
    public void test222() {
        Assertions.assertEquals(1, regExSearch.search(text2, word22));
    }

    @Test
    public void test232() {
        Assertions.assertEquals(2, regExSearch.search(text2, word23));
    }

    @Test
    public void test213() {
        Assertions.assertEquals(4, searchEnginePunctuationNormalizer1.search(text2, word21));
    }

    @Test
    public void test223() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer1.search(text2, word22));
    }

    @Test
    public void test233() {
        Assertions.assertEquals(2, searchEnginePunctuationNormalizer1.search(text2, word23));
    }

    @Test
    public void test214() {
        Assertions.assertEquals(4, searchEnginePunctuationNormalizer2.search(text2, word21));
    }

    @Test
    public void test224() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer2.search(text2, word22));
    }

    @Test
    public void test234() {
        Assertions.assertEquals(2, searchEnginePunctuationNormalizer2.search(text2, word23));
    }

    @Test
    public void test215() {
        Assertions.assertEquals(5, searchEngineCaseNormalizer1.search(text2, word21));
    }

    @Test
    public void test225() {
        Assertions.assertEquals(5, searchEngineCaseNormalizer1.search(text2, word22));
    }

    @Test
    public void test235() {
        Assertions.assertEquals(2, searchEngineCaseNormalizer1.search(text2, word23));
    }

    @Test
    public void test216() {
        Assertions.assertEquals(5, searchEngineCaseNormalizer2.search(text2, word21));
    }

    @Test
    public void test226() {
        Assertions.assertEquals(5, searchEngineCaseNormalizer2.search(text2, word22));
    }

    @Test
    public void test236() {
        Assertions.assertEquals(2, searchEngineCaseNormalizer2.search(text2, word23));
    }

    String word3 = "4-х";
    String text3 = " .4-х, ";

    @Test
    public void test31() {
        Assertions.assertEquals(1, easySearch.search(text3, word3));
    }

    @Test
    public void test32() {
        Assertions.assertEquals(1, regExSearch.search(text3, word3));
    }

    @Test
    public void test33() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer1.search(text3, word3));
    }

    @Test
    public void test34() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer2.search(text3, word3));
    }

    @Test
    public void test35() {
        Assertions.assertEquals(1, searchEngineCaseNormalizer1.search(text3, word3));
    }

    @Test
    public void test36() {
        Assertions.assertEquals(1, searchEngineCaseNormalizer2.search(text3, word3));
    }

    String word4 = "1";
    String text4 = "один и 1.";

    @Test
    public void test41() {
        Assertions.assertEquals(1, easySearch.search(text4, word4));
    }

    @Test
    public void test42() {
        Assertions.assertEquals(1, regExSearch.search(text4, word4));
    }

    @Test
    public void test43() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer1.search(text4, word4));
    }

    @Test
    public void test44() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer2.search(text4, word4));
    }

    @Test
    public void test45() {
        Assertions.assertEquals(1, searchEngineCaseNormalizer1.search(text4, word4));
    }

    @Test
    public void test46() {
        Assertions.assertEquals(1, searchEngineCaseNormalizer2.search(text4, word4));
    }

    String word5 = "бабушка";
    String text5 = "Привет, Бабушка, привет, бабушка привет бабушку привет бабушке привет бабушку привет.";

    @Test
    public void test51() {
        Assertions.assertEquals(1, easySearch.search(text5, word5));
    }

    @Test
    public void test52() {
        Assertions.assertEquals(1, regExSearch.search(text5, word5));
    }

    @Test
    public void test53() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer1.search(text5, word5));
    }

    @Test
    public void test54() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer2.search(text5, word5));
    }

    @Test
    public void test55() {
        Assertions.assertEquals(2, searchEngineCaseNormalizer1.search(text5, word5));
    }

    @Test
    public void test56() {
        Assertions.assertEquals(2, searchEngineCaseNormalizer2.search(text5, word5));
    }

    @Test
    public void test57() {
        Assertions.assertEquals(4, searchEngineNormalizer1.search(text5, word5));
    }

    @Test
    public void test58() {
        Assertions.assertEquals(4, searchEngineNormalizer2.search(text5, word5));
    }

}
