import java.util.stream.LongStream;

public class primeDec {
    public static boolean isPrime(long number) {
        return number > 1 && LongStream
                .rangeClosed(2, (long) Math.sqrt(number)) // dimulai dari 2 sampai, hasil akar dari argumen dan di casting bertipe long
                .parallel() // prosesnya dibagi bagi kepada thread yang ada pada processor alhasil lebih cepat tetapi tidak berurutan
                .noneMatch(index -> number % index == 0); // mulai prosesnya, jika number yang dibagi dari hasil list akar tersebut tidak membaginya habis maka true
    }
    public static void main(String[] args) {
        boolean hasil;
//        hasil = isPrime(9220000000000000039L);
        hasil = isPrime(101L);
        System.out.println(hasil);
    }
}

/**
 * Longstream disini digunakan untuk memproses data yang bertipe Long
 * long disini bisa menyimpan data integer yang paling besar
 *
 *
 *
 *
 * long stream juga disini ada method yang spesifik dikhusukan untuk mengolah data long
 *
 * Buatlah Pemrograman untuk menghitung faktorial dengan cara imperatif dan deklaratif**
 */
