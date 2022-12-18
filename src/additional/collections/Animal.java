package additional.collections;

import java.util.Random;

import static additional.collections.Generator.randomNickForAnimal;

public class Animal {
    private int age ;
    private String nick;

    public Animal() {
        Random random = new Random();
        this.age = random.nextInt(1,16);
        this.nick = randomNickForAnimal();
    }

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
