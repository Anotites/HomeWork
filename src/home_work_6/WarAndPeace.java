package home_work_6;

import home_work_6.api.ComparatorAlphabet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class WarAndPeace implements Iterable<String>{

    Set<String> resultSet;

    WarAndPeace(Set<String> resultSet) {
        this.resultSet =resultSet;
    }

    public static String readWarAndPeace(String nameOfFile) {
        String text = "";
        try (BufferedReader reader
                     = new BufferedReader(
                            new FileReader(nameOfFile)
                       )
        ) {
            StringBuilder builder = new StringBuilder();
            String data;
            while ((data = reader.readLine()) != null) {
                builder.append(data);
            }
            text = builder.toString();
        } catch (FileNotFoundException e1) {
            System.out.println("Файл не найден: " + e1.getMessage());
        } catch (IOException e2) {
            System.out.println("Произошла ошибка при чтении файла: " + e2.getMessage());
        }
        return text;
    }

    public String[] makeArrayFromText(String nameOfFile) {
        String toInsert = readWarAndPeace(nameOfFile);
        String newString = toInsert.replaceAll("[:\\.)(,!\";\\r<\\n\\t]|(\\?\\s)|(\\?\\r)|(\\?\\n)|(--)|(\\s)|(-\\s)"," ");

        String[] newStrings = newString.replaceAll("\\?","").split("\\s");
        String[] resultString = new String[newStrings.length];
        System.arraycopy(newStrings, 0, resultString, 0, newStrings.length);
        return resultString;
    }

    public int countSetCollectionFromText(String nameOfFile) {
        String[] resultString = makeArrayFromText(nameOfFile);
        this.resultSet = new HashSet<>(Arrays.asList(resultString));
        resultSet.removeAll(Arrays.asList("", null,"-","--"));
        return resultSet.size();
    }

    public int countListCollectionFromText(String nameOfFile) {
        return makeListCollectionFromText(nameOfFile).size();
    }

    public List<String> makeListCollectionFromText(String nameOfFile) {
        String[] resultString = makeArrayFromText(nameOfFile);
        List<String> resultList = new ArrayList<>(Arrays.asList(resultString));
        resultList.removeAll(Arrays.asList("", null, "-", "--"));
        return resultList;
    }

    public String makeMapCollectionFromText(String nameOfFile, int top) {
        List<String> resultList = makeListCollectionFromText(nameOfFile);

        Map<String,Integer> resultMap = new HashMap<>();
        for (String item1:resultList) {
            if(resultMap.containsKey(item1)) {
                resultMap.put(item1,resultMap.get(item1)+1);
        } else {resultMap.put(item1,1);}}

        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(resultMap.entrySet());

        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        StringBuilder sortResult= new StringBuilder();
        for (int i = 0; i < top; i++) {
            sortResult.append(entryList.get(i).getKey()).append(" - ").append(entryList.get(i).getValue()).append("; ");
        }
        return sortResult.toString();
    }

    public Set<String> readCollectionFromText() {
        return this.resultSet;
    }

    public List<String> sortAlphabet() {
        List<String> sortList = new ArrayList<>(this.resultSet);
        sortList.sort(new ComparatorAlphabet());
        return sortList;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}


