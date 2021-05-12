package collections_examples;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {

        Map<String, String> colorsDescription = new HashMap<String, String>();  // odpowidnik słownika w Pythonie, klucz, wartość
        colorsDescription.put("apple", "red"); // klucz jabłko, wartość czerwony
        colorsDescription.put("kiwi", "zielony");
        colorsDescription.put("banana", "yellow");
        System.out.println(colorsDescription);
        System.out.println(colorsDescription.get("kiwi")); // odwołanie się do klucza
        System.out.println(colorsDescription.keySet()); //wyprintuje klucze
        colorsDescription.replace("apple", "mixed");
        System.out.println(colorsDescription);
        colorsDescription.containsKey("strawberry"); // typ boolin
        System.out.println(colorsDescription.containsKey("banana"));
        System.out.println(colorsDescription.values()); //pobranie wszystkich wartości

        for (String key: colorsDescription.keySet()){
            System.out.println("To jest owoc " + key + " a jego kolor to " + colorsDescription.get(key)); // get(key) wyprintuje WARTOSC a nie klucz

        }

        System.out.println(colorsDescription.size());

    }
}
