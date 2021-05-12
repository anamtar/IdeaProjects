package operatorylogiczne;

public class Operatorylogiczne {

    public static void main(String[] args) {

        /*

        Operatory Logiczne

        true   false

        ! negacja
        !(true) - false
        !(false) - true

        && - koniunkcja, "I", w tym samym momencie

         */

        int a = 5;
        int b = 5;
        int c = 7;

        if (a == b)
            System.out.println("tak");

        if (!(a == c))
            System.out.println("coś tam");

    }
}
