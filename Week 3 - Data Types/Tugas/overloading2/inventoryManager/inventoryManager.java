package inventoryManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class inventoryManager {

    // generateDateTime :: -> String
    public static String generateDateTime (){
        DateTimeFormatter localFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = LocalDateTime.now().format(localFormatter);
        return time;
    }

    // addProduct :: String -> Double -> String[]
    public String[] addProduct(String namaProduk, double harga){
        String hargaInString = Double.toString(harga);
        String[] product = {generateDateTime().toString(), namaProduk, hargaInString};
        return product;
    }

    // addProduct :: String -> Double -> Number -> String[]
    public String[] addProduct(String namaProduk, final double harga, final int stok){
        String hargaInString = Double.toString(harga);
        String stokInString = Integer.toString(stok);
        String[] product = {generateDateTime().toString(), namaProduk, hargaInString, stokInString};
        
        return product;
    }

    // addProduct :: String -> Double -> Number -> String -> String[]
    public String[] addProduct(String namaProduk, double harga, int stok, String deskripsi){
        String hargaInString = Double.toString(harga);
        String stokInString = Integer.toString(stok);
        String[] product = {generateDateTime().toString(), namaProduk, hargaInString, stokInString, deskripsi};
        
        return product;
    }
}
