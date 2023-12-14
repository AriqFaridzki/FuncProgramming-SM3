
public class ariqThreads extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread running");
    }

    public static void main(String[] args) {
        ariqThreads thread1  = new ariqThreads();
        thread1.start();
    }
}

// Thread bisa membuat program untuk beroperasi lebih efisien dengan membuatnya bisa melakukan banyak hal dalam 1 waktu
// dari sini kita mengextends ( inherit ) dari class Thread dan override method run() agar bisa melakukanya
// cara eksekusinya yaitu dengna membuat object baru dan memakai method .start() untuk memulai method run() berjalan
// jika tidak override run() maka thread tidak bisa dijalankan ( kosong)