public class Latihan5fix{
    // add :: Number -> Number -> Number
    public void add(int x, int y){
        System.out.println(x+y);
    }
    // add :: Double -> Double -> Double
    public double add(double x, double y){ 
        return x + y;
    }

    // add :: Double -> Double -> Double -> Double
    public double add(double x, double y, int z){ 
        return x + y + z;
    }
    
    public static void main(String[] args ){
        Latihan5fix myClass = new Latihan5fix();

        myClass.add(1, 2);
        // System.out.println(myClass.add(1, 5)); // konfik dengan method add pertama
        System.out.println(myClass.add(1, 2, 3));

    }
}

/*
 * Kode ini error dikarenakan nama parameter yang sama, 
 * jadi untuk memperbaikinya ubahlah tipe data parameternya
 * atau tambahkan parameter baru 
 */