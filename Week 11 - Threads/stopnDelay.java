public class stopnDelay implements Runnable {
    private boolean doStop = false;
    public synchronized void doStop() {
        this.doStop = true;
    }
    private synchronized boolean keepRunning() {
        return this.doStop == false;
    }

    @Override
    public void run() {
        while(keepRunning()) {
          
            System.out.println("Running");

            try {
                Thread.sleep(3L * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        stopnDelay myRunnable = new stopnDelay();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myRunnable.doStop();
    }

}

// program ini dijalankan dalam waktu 10 detik, yang setiap 3 detiknya mengeluarkan "Running"
// dalam konteks ini thread.sleep digunakan untuk membuat thread itu pause selama 3 detik setiap iterasinya
// doStop disini sebagai untuk menghentikan trigger untuk stop program ( seperti tombol lampu)
// nah setelah melewati 10 detik pada (thread.sleep (10L * 1000L)) ini akan mengubah variable doStop menjadi false
// yang akan menghentikan proses iterasi pada java.

// yang delay ada thread myRunnable ( hanya 1 thread)