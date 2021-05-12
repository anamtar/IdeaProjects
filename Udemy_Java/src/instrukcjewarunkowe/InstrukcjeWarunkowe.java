package instrukcjewarunkowe;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {

        int a = 5, b = 6, c = 9;

        int zz = 3;
        int zx = 4;

        if (zz == zx)
            System.out.println("zz jest równe zx");
        else if (zz < zx) {
            System.out.println("zz jest mniejsze od  zx");
            System.out.println("a tu coś jeszcze wpisze");
        }
        else
            System.out.println("zz jest większe od zx");

        System.out.println(a != b);    // to jest pytanie logiczne, więc zwrocone zostanie true lub false
        if (a != b)
            System.out.println("test");

        if (a != b && c > 3)
            System.out.println("a jest różne od b i jednocześnie c > 3");

        if (a > b)
            System.out.println("a jest większe od b");
        else if (a < b)
        {
            System.out.println("a jest mniejsze od b");
            System.out.println("a to druga linijka, bo jeżeli a < b to zostanie wykonana każda instrukcja");
        }
        else
        System.out.println("a jest równe b");

    }
}
