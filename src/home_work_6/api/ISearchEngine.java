package home_work_6.api;

public interface ISearchEngine {
    /**
     * Метод, который выводит, сколько раз встречается в тексте слово.
     *
     * @param text Текст, в котором производится поиск.
     * @param word Слово, которое ищут.
     * @return Сколько раз слово встречается в тексте.
     */
    long search(String text, String word);
}
