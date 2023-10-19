package Week_5_HoF;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<Integer, Integer> tambahSatu = tambah(1);
        Function<Integer, Integer> tambahDua = tambah(2);
        Function<Integer, Integer> tambahTiga = tambah(3);

        Integer result = tambahSatu.apply(6);
        System.out.println(result);

        result = tambahDua.apply(4);
        System.out.println(result);

        Function<Integer, Integer> kurangi10 = kurangi(10);

        result = kurangi10.apply(5);
        System.out.println(result);

        /*
        * kurangi10 :: Number -> Number
        *
        * intinya logic nya dipindahkan, nanti argumen .apply
        * dipindahkan ke Function Interface kurangi
        *
        * untuk logic nya nanti bisa langsung diinput sebagai
        * argumen seperti kurangi(10)
        *
        * */

    }

    static Function<Integer, Integer> tambah(Integer x){
        return y -> y + x;
    }

    static Function<Integer, Integer> kurangi(Integer z){
        return y -> y - z;
    }

}
