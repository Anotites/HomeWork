package home_work_5.api;

public class ComparatorString implements Comparator<String> {
    @Override
    public int compare(String item1, String item2) {
        if (item1.length() - item2.length() < 0) {
            return -1;
        } else return 1;
    }
}
