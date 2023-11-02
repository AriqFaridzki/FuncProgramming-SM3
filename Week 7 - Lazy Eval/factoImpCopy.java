public class factoImpCopy {

    public static int factorial(int amount){

        for (int i = amount; amount > 1; i--) {

            if(i == 0 || i == 1){
                return amount;
            }
                amount *= i - 1; 
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

/**
 * Rumus Factorial : 
 * n! = n * (n – 1)!
 * n! = 1 if n = 0 or n = 1
 */