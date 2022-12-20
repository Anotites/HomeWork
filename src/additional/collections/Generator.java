package additional.collections;

import java.io.*;
import java.util.Random;

public class Generator {

    /**
     * Метод, который генерирует рандомную строку (неважно из чего состоит) для имен, кличек и ников.
     *
     * @return Строка из рандомных символов (количество символов от 1 до 10).
     */
    public static String randomDiffForNameAndNickAndPersonNick() {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01" +
                "23456789АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Random random = new Random();
        int length = random.nextInt(1, 11);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return result.toString();
    }

    /**
     * Метод, который генерирует рандомную строку (состоит из русских букв) для имен и кличек.
     *
     * @return Строка из рандомных русских букв (количество символов от 1 до 10).
     */
    public static String randomDiffRusForNameAndNick() {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Random random = new Random();
        int length = random.nextInt(1, 11);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return result.toString();
    }

    /**
     * Метод, который генерирует рандомную строку (состоит из английских букв) для ников.
     *
     * @return Строка из рандомных английских букв (количество символов от 1 до 10).
     */
    public static String randomDiffEngForPersonNick() {
        String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int length = random.nextInt(1, 11);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return result.toString();
    }

    /**
     * Метод, который генерирует рандомное имя (настоящее имя).
     *
     * @return Рандомное имя (настоящее имя).
     */
    public static String randomName() {
        String[] names = {"Светлана", "Дмитрий", "Елена", "Даниил", "Вадим",
                "Максим", "Оксана", "Владислав", "Никита", "Екатерина", "Артем", "Иван", "Ольга",
                "Кирилл", "Егор", "Елизавета", "Илья", "Артем", "Виктория", "Андрей"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    /**
     * Метод, который генерирует рандомное имя (настоящее имя) из файла.
     *
     * @return Рандомное имя (настоящее имя).
     */
    public static String randomNameFromFile() {
        String[] names = dataFromFiles("names.txt");
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    /**
     * Метод, который генерирует рандомное имя животного (настоящая кличка).
     *
     * @return Рандомное имя животного (настоящая кличка).
     */
    public static String randomNickForAnimal() {
        String[] nicks = {"Шарик", "Жучка", "Мурзик", "Клубок", "Лада",
                "Рыжик", "Снежок", "Мурка", "Котик", "Мухтар", "Альба", "Барс", "Серенький",
                "Персик"};
        Random random = new Random();
        return nicks[random.nextInt(nicks.length)];
    }

    /**
     * Метод, который генерирует рандомное имя животного (настоящая кличка) из файла.
     *
     * @return Рандомное имя животного (настоящая кличка).
     */
    public static String randomNickForAnimalFromFile() {
        String[] nicks = dataFromFiles("nicks.txt");
        Random random = new Random();
        return nicks[random.nextInt(nicks.length)];
    }

    /**
     * Метод, который генерирует рандомный ник из файла.
     *
     * @return Рандомный ник.
     */
    public static String randomPersonNickFromFile() {
        String[] nicks = dataFromFiles("personNicks.txt");
        Random random = new Random();
        return nicks[random.nextInt(nicks.length)];
    }

    /**
     * Метод, который генерирует рандомную строку с паролем (неважно из чего состоит).
     *
     * @return Строка из рандомных символов (количество символов от 5 до 10).
     */
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

    /**
     * Метод, который читает информацию из файла и выводит данные как массив строк.
     *
     * @param name Имя файла, из которого необходимо прочитать информацию.
     * @return Массив строк из данных из файла.
     */
    public static String[] dataFromFiles(String name) {
        StringBuilder result = new StringBuilder();
        try {
            Reader inputStream = new FileReader(name);
            int inputRead;
            while ((inputRead = inputStream.read()) != -1) {
                result.append((char) inputRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return makeArray(String.valueOf(result));
    }

    /**
     * Метод, который из строки делает массив строк.
     *
     * @param toInsert Строка для перевода в массив.
     * @return Массив строк.
     */
    public static String[] makeArray(String toInsert) {
        String[] toSplit = toInsert.split(" ");
        String[] result = new String[toSplit.length];
        System.arraycopy(toSplit, 0, result, 0, toSplit.length);
        return result;
    }
}
