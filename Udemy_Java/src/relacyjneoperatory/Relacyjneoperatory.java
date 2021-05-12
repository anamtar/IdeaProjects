package relacyjneoperatory;

public class Relacyjneoperatory {

    public static void main(String[] args) {
        /*

        OPERATOR RELACYJNY porównuje zmienne

        == czy coś jest sobie równe 4 == 4
        != czy coś jest różne od siebie
        > większe od
        < mniejsze od
        >= - większe bądz równe
        <= mniejsze bądz równe



         */

        boolean isTrue = 4 == 8; // zwróci fałsz 4 == 4 zwróci prawdę

        System.out.println(isTrue);

        System.out.println(5 != 8);   // zwraca true albo false
        System.out.println(5 < 8);   // zwraca true albo false
        System.out.println(5 <= 8);   // zwraca true albo false
        System.out.println(5 >= 8);   // zwraca true albo false
    }
}
