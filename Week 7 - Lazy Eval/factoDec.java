import java.util.Collections;
import java.util.stream.IntStream;

public class factoDec {

    public static int factorial(int amount){
        if(amount == 0 || amount == 1 ){
            return amount;
        }
        return amount * factorial(amount - 1);
    }

    public static int factorials(int amount){ 

        return IntStream // menggunakan IntStream sebagai stream yang dispesialisasikan untuk tipe data INT
        .rangeClosed(1, amount) // generate angka 1 sampai 5
        .reduce(1, (prev, current) -> prev * current );

        // .reduce untuk menjumlah hasil perkaliannya yang dimulai dari 1, 
        // dan akan dikalikan dari hasil rangeClosed itu [1,2,3,4,5]
        // strukturnya adalah [hasil, hasil * elemen yang berikutnya]
        // jadi seperti [1, 1 * 1] -> [2, 1 * 2 ] [6, 2 * 3] [24, 6 * 4] [120, 24 * 5]
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