package inventoryManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class inventoryManager {

    public static String generateDateTime (){
        DateTimeFormatter localFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = LocalDateTime.now().format(localFormatter);
        return time;
    }

    public String[] addProduct(String namaProduk, double harga){
        String hargaInString = Double.toString(harga);
        String[] product = {generateDateTime().toString(), namaProduk, hargaInString};
        return product;
    }

    public String[] addProduct(String namaProduk, final double harga, final int stok){
        String hargaInString = Double.toString(harga);
        String stokInString = Integer.toString(stok);
        String[] product = {generateDateTime().toString(), namaProduk, hargaInString, stokInString};
        
        return product;
    }

    public String[] addProduct(String namaProduk, double harga, int stok, String deskripsi){
        String hargaInString = Double.toString(harga);
        String stokInString = Integer.toString(stok);
        String[] product = {generateDateTime().toString(), namaProduk, hargaInString, stokInString, deskripsi};
        
        return product;
    }


    // public static void main(String[] args) {
       
    // }
}
