import inventoryManager.inventoryManager;


public class tugasOverloading{

    public static void main(String[] args) {
        inventoryManager inventory = new inventoryManager();
        String[] dataProduct = inventory.addProduct(
            "Beras", 
            43.000, 
            12, 
            "Beras Berisikan 5 Kg per karung");

        for (String dataInString : dataProduct) {
            System.out.println(dataInString);
        }
        

    }
}