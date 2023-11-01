import java.util.Scanner;

public class lamda2 {
    interface Berkebalikan{
        String kebalikan(String n);
    }

    public static void main(String[] args) {
        Berkebalikan rev = (kataString) -> {
            String hasil = "";

            for (int i = kataString.length()-1 ; i >= 0 ; i--) {
                hasil += kataString.charAt(i);

            }
            return hasil;
        };

        Scanner masuk = new Scanner(System.in);
        String huruf;
        System.out.println("Masukan Huruf : " );

        huruf = masuk.nextLine();
        System.out.println("Hasil Dari Kebalikan = " + rev.kebalikan(huruf));
    }
}

/**
 *
 *  pada lamda2 yang merupakan syntax lamda adalah yang
 *  Berkebalikan rev = (kataString) -> {Kode...}
 *
 *  perbedaannya dengan lamda1 adalah lamda expression didalamnya
 *  tidak memiliki paramater seperti pada lamda2
 */
