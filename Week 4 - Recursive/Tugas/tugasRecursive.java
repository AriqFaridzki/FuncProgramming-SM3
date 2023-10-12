package Tugas;

public class tugasRecursive {
    public static void main(String[] args) {
        // System.out.println(multiByTwo(1, 10));
    
        for (int i = 0; i < 5; i++) {
            System.out.println(multiByTwoS(1, i));
        }
        
    }
    
    public static int multiByTwoS(int baseValue, int limiter){
        if(limiter == 0){
            return baseValue;
        } else{    
            return multiByTwoS(2 * baseValue , limiter - 1);
        }
    }

    /*
     * = multiByTwoS(2 * baseValue, limiter - 1)
     * = multiByTwoS(2 * 1, 5 - 1)
     * = multiByTwoS(2 * 2, 4 - 1)
     * = multiByTwoS(2 * 4, 3 - 1)
     * = multiByTwoS(2 * 8, 2 - 1)
     * = multiByTwoS(2 * 16, 1 - 1)
     * = value limiter mencapai 0, mengembalikan baseValue dari argumen
     * 
     * base case : jika limiter == 0 maka ambil parameter dari baseValue (return baseValue)
     * 
     * 
     */


    public static int multiByTwo (int targetValue){
        if(targetValue > 0){
            int res = multiByTwo(targetValue - 1) +targetValue * 2;
            System.out.println(res);
            return res;
        } else{
            return 0;
        }
    }

    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
    }
}
