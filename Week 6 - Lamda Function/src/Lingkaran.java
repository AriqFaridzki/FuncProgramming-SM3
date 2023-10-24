public class Lingkaran {

    static LingkaranInterface getLuas = (radius) ->
            3.14 * (radius * radius);
    static LingkaranInterface getKeliling = (radius) ->
            2 * 3.14 * radius;

    public static void main(String[] args) {
        System.out.println(getLuas.hitung(7));

    }


}
