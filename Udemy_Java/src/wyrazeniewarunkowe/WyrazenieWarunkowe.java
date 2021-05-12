package wyrazeniewarunkowe;

public class WyrazenieWarunkowe {

    public static void main(String[] args) {

        int x = 5;

        if (x%2 == 0)
            System.out.println("liczba parzysta");
        else
            System.out.println("liczba nieparzysta");

        String czyParzysta = x%2 ==0 ? "parzysta" : "nieparzysta"; // tak też można zapisać po ? piszemy co kiedy true a po : co kiedy false
        System.out.println(czyParzysta);



    }
}
