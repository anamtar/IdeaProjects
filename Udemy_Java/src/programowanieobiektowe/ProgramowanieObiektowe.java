package programowanieobiektowe;

public class ProgramowanieObiektowe {

    public static void main(String[] args) {
        /*
        Obiekty - pojemniki do przechowywania zmiennych i funkcji tematycznie ze sobą powiązanych
        do dalszego, łatiwejszego użycia
        Klasy - foremki do tworzenia obiektow

        Properiets - właściciwości
        Metody - funkcje, wszyztko co jest w śroku klasy
         */

        Monitor abc = new Monitor(); //konstruktor
        abc.szerokosc = 124;
        abc.wysokosc = 222;
        Monitor abc2 = new Monitor();
        abc2.wysokosc = 123;

        System.out.println(abc.szerokosc);

//        new Punkt(); // konstruktor
//        Punkt p1;
//        p1 = new Punkt();
        Punkt p = new Punkt(); // albo taki zapis konstrukira, or razu z obiektem p

//        p.x = 6;
//        p.y = 22;

        System.out.println(p.x);
        System.out.println(p.y);

        Punkt p2 = new Punkt(23,45);
        System.out.println(p2.x);
        System.out.println(p2.y);

        Test a = new Test();

        a.wypisz();
        a.wypisz("Adam");
        a.wypisz("Adam", "Ryszkowski");
        int wynik = a.dodaj(5,4);
        System.out.println(wynik);

    }
}

    class Monitor
    {
        int szerokosc;
        int wysokosc;

        void wlacz(){ //metoda

        }

        void wyłacz(){

        }
    }

    class Punkt
    {
        Punkt()
        {
            System.out.println("Wywołano konstruktir domyslny");
//            x = 20;
//            y = 20;
        }
        Punkt(int pierwszy, int drugi)
        {
            x = pierwszy;
            y = drugi;
        }
        int x;
        int y;
    }

    class Test    //klasa
    {
        void wypisz(){ // metoda void nic nie zwraca, więc może coś wykonać, każda metoda może przyjmować argumenty (w nawiasach)
            System.out.println("hahhahahaha");  // metoda
        }

        void wypisz(String imie){ // voida nie da się do niczego przypisać
            System.out.println(imie);
        }

        void wypisz(String imie, String nazwisko){

            System.out.println(imie + " " + nazwisko);
        }

        int dodaj(int a, int b){
            return a + b; // jak metoda ma typ inny niż void to musi być return
        }

    }


