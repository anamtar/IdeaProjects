package tablice;

public class Tablice {

    public static void main(String[] args) {

        int[] tab; //zadeklarowanie tablicy

        tab = new int[5]; // zadeklarowanie tablicy z 5 miejscami

        int[] tab1 = new int[5]; // drugi sposob deklaracji tablicy
        int[] tab2 = {1, 14, 3, 232}; // trzeci sposob deklaracji tablicy

        System.out.println(tab[0]); // odwołanie się do 0 miejsca w tablicy. Teraz, domyślnyi wartościami w tablicy są 0 na każdym z miejsc

        tab[0] = 20;  // przypisanie wartości  do miejsca
        tab[1] = 7;
        tab[2] = 27;
        tab[3] = 15;
        tab[4] = 77;

        System.out.println(tab[0]); //teraz dla tab[0]jest już 20

        System.out.println(tab2[3]);

        System.out.println((tab.length) + " " + (tab1.length) + " " + (tab2.length));
        System.out.println(tab[tab.length-1] + tab1[tab1.length-1] + tab2[tab2.length-1]);
        System.out.println(tab[tab.length-1] + " " + tab1[tab1.length-1] +  " " + tab2[tab2.length-1]);


    }
}
