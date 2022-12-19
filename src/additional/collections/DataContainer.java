package additional.collections;

import java.util.*;
import java.util.function.Consumer;

public class DataContainer implements Iterable<Person>{
    private Collection<Person> data;

    DataContainer(Collection<Person> collection) {
        this.data = collection;
    }

    public void fill(int count) {
        int check=0;
        while (check<count)  {
            this.data.add(new Person());
            check++;
        }
    }

    public void delete() {
        this.data.clear();
    }

//    public void mySort(Comparator<? super Person> comparator) {
//        for (Person p : this.data) {
//            int minIndex = i;
//            for (int j = i + 1; j < this.data.length; ++j) {
//                if (comparator.compare(this.data[j], this.data[minIndex]) < 0) {
//                    minIndex = j;
//                }
//            }
//            T temp = this.data[i];
//            this.data[i] = this.data[minIndex];
//            this.data[minIndex] = temp;
//        }
//    }

    @Override
    public String toString() {
        return ""+data;
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Person> spliterator() {
        return Iterable.super.spliterator();
    }

}
