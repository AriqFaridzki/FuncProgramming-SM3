package Week_5_HoF;

import java.util.*;

public class compare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,4,9,7);

        Collections.sort(numbers, (a, b) ->{
            return a.compareTo(b);
        });

        System.out.println("Regular Collections Sort : " + numbers);

        Comparator<Integer> comparator = (a,b) -> {
            return a.compareTo(b);
        };

        Comparator<Integer> reverserComparator = comparator.reversed();


        Collections.sort(numbers, reverserComparator);
        System.out.println(" Using Comparator Sort : " + numbers);

    }
}
