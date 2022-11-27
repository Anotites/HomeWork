package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class Task63 implements ICommunicationPrinter {

    public String welcome(String name) {
        String result;
        switch (name) {
            case "Вася":
                result = "Привет!\nЯ так долго тебя ждал!";
                break;
            case "Анастасия":
                result = "Я так долго тебя ждал!";
                break;
            default:
                result = "Добрый день, а вы кто?";
        }
        return result;
    }
}
