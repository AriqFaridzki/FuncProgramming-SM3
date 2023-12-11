package DictionarySets;

import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set<String> abjad = new HashSet<String>();

        abjad.add("A");
        abjad.add("B");
        abjad.add("C");
        abjad.add("D");

        for (String value : abjad)
            System.out.print(value + ", ");
        System.out.println();
    }
}
