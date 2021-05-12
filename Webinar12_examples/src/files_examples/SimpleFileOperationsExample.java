package files_examples;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileOperationsExample {

    public static void main(String[] args) {

        String pathToFile = System.getProperty("user dir");
        System.out.println(System.getProperty("user dir"));
        writeTiFile(pathToFile, "Tomasz");

        writeTiFileWithoutTry(pathToFile, "Zosia");

    }

    public static void writeTiFile(String filePath, String textToSave){
        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath, true);
            fw.write(textToSave);

        } catch (IOException e) {
            System.out.println("Wystąpił błąd z obsługą pliku");
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void writeTiFileWithoutTry(String filePath, String textToSave){
        FileWriter fw = "null";


    }



    }