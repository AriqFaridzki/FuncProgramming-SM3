package Tugas;

import java.util.ArrayList;

public class tugasRecursive {
    public static void main(String[] args) {
        // System.out.println(multiByTwo(1, 10));
    
        for (int i = 0; i < 10; i++) {
            System.out.println(multiByTwoS(1, i));
        }
        
    }
    
    public static int multiByTwoS(int baseValue, int limiter){
        if(limiter == 0){
            return baseValue;
        } else{
            
            return multiByTwoS(baseValue * 2, limiter - 1);
        }
    }


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
