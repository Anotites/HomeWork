package additional.files;

import java.io.File;
import java.util.ArrayList;

import static additional.files.Directories.*;
import static additional.files.Scanner.scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Something> items = new ArrayList<>();
        String file = scanner();
        File directory = new File(file);
        findItemsFromDirectories(directory, items);

        System.out.println("Количество папок в директории = " + quantityFolder(items));

        System.out.println("Количество файлов в директории = " + quantityFile(items));

        System.out.println("Количество txt файлов в директории = " + quantityTxt(items));

        System.out.println("Количество скрытых файлов в директории = " + quantityHidden(items));
    }
}

