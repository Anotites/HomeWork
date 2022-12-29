package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        String toInsert1 = text.replace(",", "_");
        String toInsert2 = toInsert1.replace(".", "_");
        String toInsert3 = toInsert2.replace("!", "_");
        String toInsert4 = toInsert3.replace("--", "_");
        String toInsert5 = toInsert4.replace(":", "_");
        String toInsert6 = toInsert5.replace(")", "_");
        String toInsert7 = toInsert6.replace("(", "_");
        String toInsert8 = toInsert7.replace("\"", "_");
        String toInsert9 = toInsert8.replace("<", "_");
        String toInsert10 = toInsert9.replace(";", "_");
        String toInsert11 = toInsert10.replace("? ", "_");
        String toInsert12 = toInsert11.replace(" -", "_");
        String toInsert13 = toInsert12.replace(" ", "_");
        String toInsert14 = toInsert13.replace("?", "");
        String toInsert15 = "_"+toInsert14+"_";

        int position = 0;
        long quantity = 0;

        word="_"+word+"_";

        while (toInsert15.indexOf(word, position) != -1) {
            position = toInsert15.indexOf(word, position) + 1;
            quantity++;
        }

        return quantity;
    }
}
