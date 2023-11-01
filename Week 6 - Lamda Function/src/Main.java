
public class Main implements MyInterface {
    @Override
    public double getValue(){
        return 3.14;
    }



    public static void main(String[] args) {

        persegiPanjang luass = (x,y) -> x + y;

        Main hasil = new Main();
        System.out.println(hasil.getValue());

        persegiPanjang luas = new persegiPanjang(){
            @Override
            public int hitung(int x, int y){
                return x * y;
            }
        };

        System.out.println(luas.hitung(12,12));

    }
}