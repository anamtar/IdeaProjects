package tablice;

public class WielowymaoroweTablice {

    public static void main(String[] args) {

        // wielowymairowa tablica ma wiersz i kolumnę

        int [][] tab = new int[4][3]; // 4 wiersze, 3 kolummy

        tab[0][0] = 25;
        tab[3][2] = 70;

        System.out.println(tab[3][2]);

        int[][] tab2 =
        {
                {4, 15, 17},
                {5, 12, 125},
                {651, 1256, -24},
                {655, 2, -2444}
        };
        System.out.println(tab2[3][0]);
    }
}
