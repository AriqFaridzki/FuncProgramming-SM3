public class ThreadNaming{
    public static void main(String[] args) {
        Thread thread = new Thread("New Thread"){
            @Override
            public void run() {
                System.out.println("Run By: " + getName());
            }
        };

        // seperti biasa override untuk eksekusi kode dalam run() method, yang nantinya bisa di panggil oleh .start() saat dibuat objectnya
        // tetapi bisa dinamakan nama methodnya dan ini juga bisa membuat banyak thread dengan nama yang bervariasi.

        Thread lamdaVerThread = new Thread(()->{
            Thread.currentThread().setName("Ariq Thread using lamda");
             System.out.println("Run By: " + Thread.currentThread().getName());
        });

        thread.start();
        lamdaVerThread.start();
    
        System.out.println(thread.getName());
        System.out.println(lamdaVerThread.getName());

    }
}