import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class HoF_functions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,4,9,7);

        // System.out.println(test.apply(numbers));

        // System.out.println(numbers.stream()
        // .map(square).collect(Collectors.toList()));

        System.out.println(numbers.stream()
        .map(a -> a*a).collect(Collectors.toList()));
    }
    static Function<Integer, Integer> square = a -> a * a;

    static Predicate<Integer> isEven = x -> x % 2 == 0;

    static Function<List<Integer>, List<Integer>> test = a -> a.stream()
    .filter(isEven)
    .collect(Collectors.toList());

    

    
}


