package additional.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("а", "1234", "Петя"));
        people.add(new Person("б", "123", "Леша"));
        people.add(new Person("в", "123", "Леша"));
        people.add(new Person("г", "123", "Леша"));
        people.add(new Person("z", "123456", "Женя"));
        people.add(new Person("x", "123", "Света"));
        people.add(new Person("y", "123", "Катя"));
        people.add(new Person("u", "123", "Олег"));
        people.add(new Person("m", "123456", "Петя"));

        System.out.println("Список людей до сортировки: " + people);

        people.sort(new ComparatorPasswordLength());

        System.out.println("Список людей после сортировки по длине пароля: " + people);

        people.sort(new ComparatorPasswordLengthAndNick());

        System.out.println("Список людей после сортировки по длине пароля и псевдониму: " + people);

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal(10, "Анатолий"));
        animals.add(new Animal(10, "Игнат"));
        animals.add(new Animal(1, "Люцифер"));
        animals.add(new Animal(10, "Ярик"));

        System.out.println("Список животных до сортировки: " + animals);

        animals.sort(new ComparatorAge());

        System.out.println("Список животных после сортировки по возрасту: " + animals);

        animals.sort(new ComparatorAgeAndNick());

        System.out.println("Список животных после сортировки по возрасту и кличке: " + animals);
    }
}
