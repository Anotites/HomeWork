package additional.collections;

import java.util.*;
import java.util.Comparator;

import static additional.collections.Generator.randomDiffFrom5To10ForPassword;

public class NewMain {
    public static void main(String[] args) {

        int numbers = 100_000;

        // Все System.out.println с выводом всех объектов пока оставила как комменты, чтобы не выводить,
        // 100_000 позиций для каждого.

        System.out.println("*******************check LinkedList*******************");

        LinkedList<Person> dataLinkedList = new LinkedList<>();
        DataContainer peopleLinkedList = new DataContainer(dataLinkedList);

        long dataLinkedListTimeBefore = System.currentTimeMillis();
        peopleLinkedList.myFill(numbers);
        long dataLinkedListTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло " +
                (dataLinkedListTimeAfter - dataLinkedListTimeBefore) + " мс.");

//        System.out.println("До сортировки LinkedList: " + peopleLinkedList);
        dataLinkedList.sort(new ComparatorPasswordLengthClassic());
//        System.out.println("После сортировки по длине пароля LinkedList: " + peopleLinkedList.mySort(new ComparatorPasswordLength()));
//        System.out.println("После сортировки по длине пароля LinkedList: " + peopleLinkedList);
        dataLinkedList.sort(new ComparatorPasswordLengthAndNickClassic());
//        System.out.println("После сортировки по длине пароля и ника LinkedList: " + peopleLinkedList.mySort(new ComparatorPasswordLengthAndNick()));
//        System.out.println("После сортировки по длине пароля и ника LinkedList: " + peopleLinkedList);

        long dataLinkedListIteratorTimeBefore = System.currentTimeMillis();
        for (Person person : dataLinkedList) {
            person.setPassword(randomDiffFrom5To10ForPassword());
        }
        long dataLinkedListIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло " +
                (dataLinkedListIteratorTimeAfter - dataLinkedListIteratorTimeBefore) + " мс.");

        long dataLinkedListWhileTimeBefore = System.currentTimeMillis();
        int check = 0;
        while (check < dataLinkedList.size()) {
            dataLinkedList.get(check).setPassword(randomDiffFrom5To10ForPassword());
            check++;
        }
        long dataLinkedListWhileTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи While. Заняло " +
                (dataLinkedListWhileTimeAfter - dataLinkedListWhileTimeBefore) + " мс.");

        long dataLinkedListDeleteTimeBefore = System.currentTimeMillis();
        peopleLinkedList.delete();
        long dataLinkedListDeleteTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Удаление коллекции. Заняло " +
                (dataLinkedListDeleteTimeAfter - dataLinkedListDeleteTimeBefore) + " мс.");

        System.out.println("После удаления коллекции LinkedList: " + peopleLinkedList);

        System.out.println("*******************check ArrayList*******************");

        ArrayList<Person> dataArrayList = new ArrayList<>();
        DataContainer peopleArrayList = new DataContainer(dataArrayList);

        long dataArrayListTimeBefore = System.currentTimeMillis();
        peopleArrayList.myFill(numbers);
        long dataArrayListTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло " +
                (dataArrayListTimeAfter - dataArrayListTimeBefore) + " мс.");

//        System.out.println("До сортировки ArrayList: " + peopleArrayList);
        dataArrayList.sort(new ComparatorPasswordLengthClassic());
//        System.out.println("После сортировки по длине пароля ArrayList: " + peopleArrayList.mySort(new ComparatorPasswordLength()));
//        System.out.println("После сортировки по длине пароля ArrayList: " + peopleArrayList);
        dataArrayList.sort(new ComparatorPasswordLengthAndNickClassic());
//        System.out.println("После сортировки по длине пароля и ника ArrayList: " + peopleArrayList.mySort(new ComparatorPasswordLengthAndNick()));
//        System.out.println("После сортировки по длине пароля и ника ArrayList: " + peopleArrayList);

        long dataArrayListIteratorTimeBefore = System.currentTimeMillis();
        for (Person person : dataArrayList) {
            person.setPassword(randomDiffFrom5To10ForPassword());
        }
        long dataArrayListIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло " +
                (dataArrayListIteratorTimeAfter - dataArrayListIteratorTimeBefore) + " мс.");

        long dataArrayListWhileTimeBefore = System.currentTimeMillis();
        int checkForArrayList = 0;
        while (checkForArrayList < dataArrayList.size()) {
            dataArrayList.get(checkForArrayList).setPassword(randomDiffFrom5To10ForPassword());
            checkForArrayList++;
        }
        long dataArrayListWhileTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи While. Заняло " +
                (dataArrayListWhileTimeAfter - dataArrayListWhileTimeBefore) + " мс.");

        long dataArrayListDeleteTimeBefore = System.currentTimeMillis();
        peopleArrayList.delete();
        long dataArrayListDeleteTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Удаление коллекции. Заняло " +
                (dataArrayListDeleteTimeAfter - dataArrayListDeleteTimeBefore) + " мс.");

        System.out.println("После удаления коллекции ArrayList: " + peopleArrayList);

        System.out.println("*******************check HashSet*******************");

        Set<Person> dataHashSet = new HashSet<>();
        DataContainer peopleHashSet = new DataContainer(dataHashSet);

        long dataHashSetTimeBefore = System.currentTimeMillis();
        peopleHashSet.myFill(numbers);
        long dataHashSetTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло " +
                (dataHashSetTimeAfter - dataHashSetTimeBefore) + " мс.");

        List<Person> sortedDataHashSet = new ArrayList<>(dataHashSet);
        DataContainer sortedPeopleHashSet = new DataContainer(sortedDataHashSet);

//        System.out.println("До сортировки HashSet: " + peopleHashSet);
        sortedDataHashSet.sort(new ComparatorPasswordLengthClassic());
//        System.out.println("После сортировки по длине пароля HashSet: " + sortedPeopleHashSet);
//        System.out.println("После сортировки по длине пароля HashSet: " + sortedPeopleHashSet.mySort(new ComparatorPasswordLength()));
        sortedDataHashSet.sort(new ComparatorPasswordLengthAndNickClassic());
//        System.out.println("После сортировки по длине пароля и ника HashSet: " + sortedPeopleHashSet);
//        System.out.println("После сортировки по длине пароля и ника HashSet: " + sortedPeopleHashSet.mySort(new ComparatorPasswordLengthAndNick()));

        long dataHashSetIteratorTimeBefore = System.currentTimeMillis();
        for (Person person : dataHashSet) {
            person.setPassword(randomDiffFrom5To10ForPassword());
        }
        long dataHashSetIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло " +
                (dataHashSetIteratorTimeAfter - dataHashSetIteratorTimeBefore) + " мс.");

        long dataHashSetWhileTimeBefore = System.currentTimeMillis();
        int checkForHashSet = 0;
        while (checkForHashSet < sortedDataHashSet.size()) {
            sortedDataHashSet.get(checkForHashSet).setPassword(randomDiffFrom5To10ForPassword());
            checkForHashSet++;
        }
        long dataHashSetWhileTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи While. Заняло " +
                (dataHashSetWhileTimeAfter - dataHashSetWhileTimeBefore) + " мс.");

        long dataHashSetDeleteTimeBefore = System.currentTimeMillis();
        peopleHashSet.delete();
        long dataHashSetDeleteTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Удаление коллекции. Заняло " +
                (dataHashSetDeleteTimeAfter - dataHashSetDeleteTimeBefore) + " мс.");

        System.out.println("После удаления коллекции HashSet: " + peopleHashSet);

        System.out.println("*******************check TreeSet*******************");

        Comparator<Person> comparator = new ComparatorPasswordLengthAndNickClassic();
        Set<Person> dataTreeSet = new TreeSet<>(comparator);
        DataContainer peopleTreeSet = new DataContainer(dataTreeSet);
        List<Person> sortedDataTreeSet = new ArrayList<>(dataTreeSet);

        long dataTreeSetTimeBefore = System.currentTimeMillis();
        peopleTreeSet.myFill(numbers);
        long dataTreeSetTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Заполнение коллекции. Заняло " +
                (dataTreeSetTimeAfter - dataTreeSetTimeBefore) + " мс.");

//        System.out.println("После сортировки по длине пароля и ника TreeSet: " + peopleTreeSet);

        long dataTreeSetIteratorTimeBefore = System.currentTimeMillis();
        for (Person person : dataTreeSet) {
            person.setPassword(randomDiffFrom5To10ForPassword());
        }
        long dataTreeSetIteratorTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи iterator. Заняло " +
                (dataTreeSetIteratorTimeAfter - dataTreeSetIteratorTimeBefore) + " мс.");

        long dataTreeSetWhileTimeBefore = System.currentTimeMillis();
        int checkForTreeSet = 0;
        while (checkForTreeSet < sortedDataTreeSet.size()) {
            sortedDataTreeSet.get(checkForTreeSet).setPassword(randomDiffFrom5To10ForPassword());
            checkForTreeSet++;
        }
        long dataTreeSetWhileTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Итерирование коллекции при помощи While. Заняло " +
                (dataTreeSetWhileTimeAfter - dataTreeSetWhileTimeBefore) + " мс.");

        long dataTreeSetDeleteTimeBefore = System.currentTimeMillis();
        peopleTreeSet.delete();
        long dataTreeSetDeleteTimeAfter = System.currentTimeMillis();
        System.out.println("Операция: Удаление коллекции. Заняло " +
                (dataTreeSetDeleteTimeAfter - dataTreeSetDeleteTimeBefore) + " мс.");

        System.out.println("После удаления коллекции TreeSet: " + peopleTreeSet);
    }

}
