public class SegitigaFix{
interface BangunRuang{
    double getKeliling(int a, int b, int c);
}

    public static void main(String[] args) {
        BangunRuang calc = (a,b,c) -> a+b+c;

        Segitiga keliling = new Segitiga();
        System.out.println("hasil Kelilingnya adalah : " + calc.getKeliling(2,3,4));
    }
}
