import inventoryManager.inventoryManager;

public class tugasOverloading{

    public static void main(String[] args) {
        inventoryManager inventory = new inventoryManager();
        
        String[] dataProduct = inventory.addProduct(
            "Beras", 
            43.000, 
            12, 
            "Beras Berisikan 5 Kg per karung");

        String[] dataProduct2 = inventory.addProduct(
            "Indomie", 
            3.000);

        System.out.println("data produk yang akan dikirim : \n");

        for (String dataInString : dataProduct) {
            System.out.println(dataInString);
        }

        System.out.println("\ndata produk yang akan dikirim : \n");
        for (String dataInString : dataProduct2) {
            System.out.println(dataInString);
        }
    }
}
