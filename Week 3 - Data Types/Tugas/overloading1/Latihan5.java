public class Latihan5{
    
    public void add(int x, int y){
        System.out.println(x+y);
    }

    public int adds(int x, int y){ 
        return x + y;
    }

    public static void main(String[] args ){
        Latihan5 myClass = new Latihan5();

        myClass.add(1, 2); // parameter sama :D jadi error
    }
}
/*
 * Kode ini error dikarenakan nama parameter yang sama, 
 * jadi untuk memperbaikinya ubahlah tipe data parameternya
 * 
 * :D
 */