import java.util.Collections;
import java.util.stream.IntStream;

public class factoDecCopy {

    public static int factorial(int amount){
        if(amount == 0 || amount == 1 ){
            return amount;
        }
        return amount * factorial(amount - 1);
    }

    public static int factorials(int amount){ 

        return IntStream
        .rangeClosed(1, amount) 
        .reduce(1, (prev, current) -> prev * current );

    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(factorials(5));
    }
}

/**
 * Rumus Factorial : 
 * n! = n * (n – 1)!
 * n! = 1 if n = 0 or n = 1
 */