package zmienne;

import javax.sound.midi.Soundbank;

public class Rzutowanie {

    public static void main(String[] args) {

        int a = 5, b = 2;
        double c = 12, d = 15;

        System.out.println((double) a / b); // przynajmniej jedna z liczb musi byc oznaczona jako double

        double wynik2 = (double) a / b;


        double e = 5, f = 2;

        double wynik1 = e / f;

        System.out.println("Dzielę e / f = " + wynik1);
        System.out.println("Dzielę a / b = " + wynik2);





    }
}
