interface MyInterface2{
    double getPiValue();
}
public class Lamda1 {
    public static void main(String[] args) {
        MyInterface2 ref;
        ref = () -> 3.1415;

        System.out.println("Value of PI : " + ref.getPiValue());
    }
}


/**
 * perbedaannya antara pertama dan kedua adalah :
 *
 *
 * yang pertama itu langsung mengimplmentasikan interface sedangkan yang kedua
 * bisa langsung menggunakan lamda expression tetapi harus memiliki 1 method saja dalam interface itu.
 *
 * lamda1 yang merupakan syntax lamda expression adalah
 * MyInteface2 ref;
 * ref = () -> 3.1415; <-- ini expressionya.
 */