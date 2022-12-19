package additional.collections;

import java.util.Random;

public class Generator {

    public static void main(String[] args) {
        String b = randomDiffForNameAndNickAndPersonNick();
        System.out.println(b);
    }

    public static String randomDiffForNameAndNickAndPersonNick() {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01" +
                "23456789АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Random random = new Random();
        int length = random.nextInt(1,11);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return result.toString();
    }

    public static String randomDiffRusForNameAndPersonNick() {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Random random = new Random();
        int length = random.nextInt(1,11);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return result.toString();
    }

    public static String randomDiffEngForPersonNick() {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int length = random.nextInt(1,11);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return result.toString();
    }

    public static String randomName() {
        String[] names = {"Светлана", "Дмитрий", "Елена", "Даниил", "Вадим",
                "Максим", "Оксана", "Владислав", "Никита", "Екатерина", "Артем", "Иван", "Ольга",
                "Кирилл", "Егор", "Елизавета", "Илья", "Артем", "Виктория", "Андрей"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static String randomNickForAnimal() {
        String[] nicks = {"Шарик", "Жучка", "Мурзик", "Клубок", "Лада",
                "Рыжик", "Снежок", "Мурка", "Котик", "Мухтар", "Альба", "Барс", "Серенький",
                "Персик"};
        Random random = new Random();
        return nicks[random.nextInt(nicks.length)];
    }

    public static String randomDiffFrom5To10ForPassword() {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01" +
                "23456789АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Random random = new Random();
        int length = random.nextInt(5, 11);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return result.toString();
    }
}
