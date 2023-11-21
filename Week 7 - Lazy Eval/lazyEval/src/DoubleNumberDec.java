import java.util.Arrays;

public class DoubleNumberDec {
    public static int[] findAndDoubleEvenNumbers(int[] arr){
        return Arrays.stream(arr)
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .toArray();
    }


    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] result = new int[numbers.length];
        
        result = findAndDoubleEvenNumbers(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]+ " ");
        }
    }
}

/**
 * 1. Bagaimana hasil dari kedua output kode di atas?
 * untuk yang pertama hasilnya adalah :
 *
 * 0
 * 4
 * 0
 * 8
 * 0
 *
 * dan untuk yang kedua adalah :
 * 4
 * 8
 *
 * 2. Dari Hasil output dan jalannya kedua program tersebut coba analisis bagaimana perbedaan
 * fungsi imperatif dan deklaratif?
 *
 * dari hasil yang telah dianalisa yang
 * pertama memproses semua isi dari array 
 * tersebut dan mengeluarkan hasilnya semua 
 * ( eager eval )
 *
 * dan yang kedua, memproses yang hanya dibutuhkan saja, yaitu dengan
 * memfilter bilangan yang dibutuhkan, setelah itu baru di proses dengan .map
 *
 *jelaskan lagi nanti untuk declarative,
 */
