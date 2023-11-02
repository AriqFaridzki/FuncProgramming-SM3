public class primeImp {
    public static boolean isPrime(long number) {
        for(long i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return number > 1;
    }
    public static void main(String[] args) {
        boolean hasil;
        hasil = isPrime(9220000000000000039L);
        System.out.println(hasil);
        System.out.println("asdasd");
    }
}

//  hasil output dari 2 kode adalah true tetapi 
//  mempunyai perbedaan waktu yang signifikan dalam 
//  mengeluarkan output

// perbedaan dari 2 fungsi dari kode yang diberikan adalah

// untuk yang menggunakan methode imperative 
// terlihat lebih kompleks, dan juga menggunakan for loop dengan 
// interasi yang lama sekali karena mengulang sesuai hasil akar dari argumen yang diberikan

// sedangkan untuk fungsi declarative lebih terlihat lebih teknis
// dan lebih simpel dalam penggunaan method dari LongStream
// kode ini lebih cepat dikarenakan menggunakan method paralel()
// yang akan membagi tugasnya ke berbagai threads dalam processor
// tugas yang dibagi tersebut adalah yang 

// .noneMatch(index -> number % index == 0).
