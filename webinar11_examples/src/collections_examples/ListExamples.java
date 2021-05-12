package collections_examples;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<String>(); // stworzenie listy
        namesList.add("Wojtek");
        System.out.println(namesList); //wyprintowanie stringa
        namesList.add("Agata");
        namesList.add("Tomasz");  // add czyli dodawanie do listy
        namesList.add("Ania");
        System.out.println(namesList);
        namesList.add(1,"Dominika");
        System.out.println(namesList);

        System.out.println(namesList.get(3)); // pobranie pozycji 3 (numerujemy od 0)
        String[] namesTab = namesList.toArray(new String[0]); //konwersja listy do tablicy

        namesList.sort(null);

        System.out.println(namesList);  //trzeba wcześniej podać komparator, czyli coś co powie jak srodtować

        namesList.add("Wojtek");
        System.out.println(namesList);
        System.out.println(namesList.lastIndexOf("Wojtek"));
        namesList.remove("Tomasz"); // usunięcie z listy
        System.out.println(namesList);
        namesList.set(4, "Kamil"); // podmianka na danym miejscu pierwszej wartości na nową
        System.out.println(namesList);

        namesList.contains("Agata"); // typ booling zwraca prawda lub fałsz co do zawartości
        namesList.clear();
        System.out.println(namesList);

    }


}
