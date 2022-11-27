package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class Task61 implements ICommunicationPrinter {
    public String welcome(String name) {
        String result;
        if (name.equals("Вася")) {
            result = "Привет!\nЯ так долго тебя ждал!";
        } else {
            if (name.equals("Анастасия")) {
                result = "Я так долго тебя ждал!";
            } else {
                result = "Добрый день, а вы кто?";
            }
        }
        return result;
    }
}
