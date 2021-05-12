package pkgswitch;

public class Switch {

    public static void main(String[] args) {

        int a = 100;
        // Switch wywyóluje każda instrukcję poniżej której znalazł poprawne rozwiązanie
        // switchy nie stosujemy raczej do stringów, i napewno nie stosujemy do double
        // do chara i inta stosujemy switche
        switch (a)
        {
            case 50:
                System.out.println("a jest równe 50");
                break;
            case 100:
                System.out.println("a jest równe 100");
                break;
            default:
                System.out.println("a nie jest równe ani 50 ani 100, jest równe " + a);
        }

    }
}
