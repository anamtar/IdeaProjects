package zmienne;

public class Zmienne {

    public static void main(String[] args) {

        int a = 10;
        int b = 6;
        int c;

        // Java rozróżnia litery, zmienne lokalne są z małej litery. piszemy nazwy zmiennej razem, drugi człon z dużej
        // tj. daneOsobowe, nie można używac słów kluczy, nie można zacząć od liczby (ale liczba może być w środdku),
        // nie może być spacji w nazwie zmiennej,
        // _ tkie

        c = a + b;

        /*
        char - 2 bajty
        byte - 8 bit
        short - 16 bit
        int - 32 bity
        float - 32 bity
        double - 64 bity (preferowane korzystanie z double)
        long - 64 bity

         */

        String imie;

        imie = "Adam";

        System.out.println(imie);

        System.out.println(c);
        System.out.println(a + "," + b);

        String text = "Hello World";
        System.out.println(text);

        double pi = 3.14;



        int age = 30;
        String przywitanie = "Cześć mam ";
        String zakonczenie = " lat";
        char kropka = '.'; // pojedynczy znak tylko miedzy ' ' . "" nie zadziała
        System.out.println(przywitanie + age + zakonczenie + kropka);


    }
}
