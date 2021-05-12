package petladowhile;

public class Petladowhile {

    public static void main(String[] args) {

//        String[] kursyProgramowania = {"Java",
//                "Java Aplikacje",
//                "Java strumienie",
//                "Java zaawansowane", "Java Android", "C#", "C# Tworzenie aplikacji"};
//
//        int i = 0;
//        while(i < kursyProgramowania.length){
//            System.out.println(kursyProgramowania[i]);
//            i++;
//        }

//        i = 0;
//        do {
//            System.out.println(kursyProgramowania[i]);
//            i++;
//        } while (i < kursyProgramowania.length);


//        int[] tablica = {1,2,3,4,5,6,7,8,9,10};
//
//        int a = 0;
//
//        while (a <= 100){
//            System.out.println(tablica[a] * 10);
//            a++;
//        }

        int[] tab;
        tab = new int [10];

        int i = 0;

        while (i < 10){

            tab[i] = (i + 1) * 10;
            System.out.println(tab[i]);
            i++;

        }

        System.out.println(tab[3]);

    }

}
