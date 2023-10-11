public class Latihan5{
    
    public void add(int x, int y){
        System.out.println(x+y);
    }
    // add :: Number -> Number -> Number (hasil return pada terakhir) 
    public int add(int x, int y){ 
        return x + y;
    
    }
/*
 * Kode ini error dikarenakan nama parameter yang sama, 
 * jadi untuk memperbaikinya ubahlah tipe data parameternya
 * 
 * :D
 */
    public static void main(String[] args ){
        Latihan5 myClass = new Latihan5();
        myClass.add(1, 2); // parameter sama :D jadi error
    }
}