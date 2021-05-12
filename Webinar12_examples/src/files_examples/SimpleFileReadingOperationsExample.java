package files_examples;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileReadingOperationsExample {

    public static void main(String[] args) {

        String pathToFile = System.getProperty("user.dir") + "\\names_base.txt";

        File file = new File(pathToFile);

        Scanner scanner = new Scanner(pathToFile);

        System.out.println(scanner.nextLine());

    }
}
