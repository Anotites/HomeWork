package home_work_5.api;

public class ComparatorInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer item1, Integer item2) {
        return item1 - item2;
    }
}
