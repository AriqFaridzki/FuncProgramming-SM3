import java.util.Arrays;

public class recursive {
    public static void main(String[] args) {
        int [] ariq = {};
        System.out.println(genFibonacci(0, 30));
        System.out.println(multiByTwo(1, 10,ariq,0));
    }

    public static int penjumlahan(int number){
        System.out.println("Penjumlahan = " + number);
        if (number == 0 ){
            return number;
        }
        return number + penjumlahan(number-1);
    }

    public static int fibonacciFinder(int targetNum){
        if (targetNum == 0){
            return 0;
        } else if (targetNum == 1) {
            return 1;
        }else{
            return fibonacciFinder(targetNum - 1) + fibonacciFinder(targetNum - 2);
        }
    }

    public static String genFibonacci(int increment, int targetNum){
        System.out.print(" " + fibonacciFinder(increment));
        if (targetNum == 0){
            return " end";
        }
        else{
            return genFibonacci(increment + 1, targetNum - 1) ;
        }

    }

    public static int[] multiByTwo(int basevalue,int limiter, int[] result, int index ){
        if(limiter == 0){
            return null;
        } else{
            int[] updatedArray = Arrays.copyOf(result, index);
            return multiByTwo(basevalue*2, limiter - 1 , updatedArray, index + 1 );
        }
    }

}


//deadline tgl 17 
