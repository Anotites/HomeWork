package additional.collections;

import java.util.*;

public class NewMain {
    public static void main(String[] args) {

        int numbers = 10;

        System.out.println("***check LinkedList***");

        LinkedList<Person> dataLinkedList = new LinkedList<>();
        DataContainer peopleLinkedList = new DataContainer(dataLinkedList);

        long dataLinkedListTimeBefore = System.currentTimeMillis();
        peopleLinkedList.fill(numbers);
        long dataLinkedListTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло "+
                (dataLinkedListTimeAfter-dataLinkedListTimeBefore)+" мс.");

        long dataLinkedListIteratorTimeBefore = System.currentTimeMillis();
        ListIterator<Person> listIterator = dataLinkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        long dataLinkedListIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло "+
                (dataLinkedListIteratorTimeAfter-dataLinkedListIteratorTimeBefore)+" мс.");

//        System.out.println("До сортировки LinkedList: "+peopleLinkedList);
        //НУЖНА ЕЩЕ СОРТИРОВКА

        System.out.println("***check ArrayList***");

        ArrayList<Person> dataArrayList = new ArrayList<>();
        DataContainer peopleArrayList = new DataContainer(dataArrayList);

        long dataArrayListTimeBefore = System.currentTimeMillis();
        peopleArrayList.fill(numbers);
        long dataArrayListTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло "+
                (dataArrayListTimeAfter-dataArrayListTimeBefore)+" мс.");

        long dataArrayListIteratorTimeBefore = System.currentTimeMillis();
        ListIterator<Person> arrayListIterator = dataArrayList.listIterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }
        long dataArrayListIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло "+
                (dataArrayListIteratorTimeAfter-dataArrayListIteratorTimeBefore)+" мс.");

//        System.out.println("До сортировки ArrayList: "+peopleArrayList);
//        dataArrayList.sort(new ComparatorPasswordLength());
//        System.out.println("После сортировки по длине пароля ArrayList: "+peopleArrayList);
//        dataArrayList.sort(new ComparatorPasswordLengthAndNick());
//        System.out.println("После сортировки по длине пароля и ника ArrayList: "+peopleArrayList);

        System.out.println("***check HashSet***");

        Set<Person> dataHashSet = new HashSet<>();
        DataContainer peopleHashSet = new DataContainer(dataHashSet);
        List<Person> sortedDataHashSet = new ArrayList<>(dataHashSet);
        DataContainer sortedPeopleHashSet = new DataContainer(sortedDataHashSet);

        long dataHashSetTimeBefore = System.currentTimeMillis();
        peopleHashSet.fill(numbers);
        long dataHashSetTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло "+
                (dataHashSetTimeAfter-dataHashSetTimeBefore)+" мс.");

        long dataHashSetIteratorTimeBefore = System.currentTimeMillis();
        ListIterator<Person> hashSetIterator = sortedDataHashSet.listIterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }        long dataHashSetIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло "+
                (dataHashSetIteratorTimeAfter-dataHashSetIteratorTimeBefore)+" мс.");

//        System.out.println("До сортировки HashSet: "+peopleHashSet);
//        sortedDataHashSet.sort(new ComparatorPasswordLength());
//        System.out.println("После сортировки по длине пароля HashSet: "+sortedPeopleHashSet);
//        sortedDataHashSet.sort(new ComparatorPasswordLengthAndNick());
//        System.out.println("После сортировки по длине пароля и ника HashSet: "+sortedPeopleHashSet);

        System.out.println("***check TreeSet***");

        Comparator<Person> comparator = new ComparatorPasswordLengthAndNick();
        Set<Person> dataTreeSet = new TreeSet<>(comparator);
        DataContainer peopleTreeSet = new DataContainer(dataTreeSet);

        long dataTreeSetTimeBefore = System.currentTimeMillis();
        peopleTreeSet.fill(numbers);
        long dataTreeSetTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло "+
                (dataTreeSetTimeAfter-dataTreeSetTimeBefore)+" мс.");

        long dataTreeSetIteratorTimeBefore = System.currentTimeMillis();
        peopleTreeSet.iterator();
        long dataTreeSetIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло "+
                (dataTreeSetIteratorTimeAfter-dataTreeSetIteratorTimeBefore)+" мс.");

//        System.out.println("После сортировки по длине пароля и ника TreeSet: "+peopleTreeSet);
    }
}
