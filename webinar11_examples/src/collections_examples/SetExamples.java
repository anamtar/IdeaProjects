package collections_examples;

import java.util.Set;
import java.util.HashSet;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> numsSet = new HashSet<Integer>(); // zbiór, może mieć tylko niepowtarzające sie wartości

        numsSet.add(3);
        numsSet.add(8);
        numsSet.add(1);
        System.out.println(numsSet);
        numsSet.add(1);
        System.out.println(numsSet);
        System.out.println(numsSet.size()); // pokaże liczbę elementów
        System.out.println(numsSet.contains(8)); // typ boolin - zwraca prawda/fałsz
        numsSet.clear(); // wyzerowanie zbioru

    }
}
