# Function Signature

ciri khas pembuatan function dalam java

## syntax function
modifier(opsional) static(opsional) return_type method_name parameter_list

## java uniqueness
1. polymorphism
   * yaitu satu method yang bisa di modifikasi lagi dengan isi fungsi yang berbeda dari original ( kayak interface )
  
    '''java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class HelloWorld {
    public static void main(String[] args) {
           
           HelloWorld hello = new HelloWorld();
           // hello.printHello();
        
        }
        
    public void printHello(){
        System.out.println("Hello World");
    }
}

public class Latihan2{
    public static void myMethod(int num){
        System.out.println("The number is: " +num);
    }
    
    public static void main(String[] args ){
        Latihan2 example = new Latihan2();
        int number = 42;
        example.myMethod(number);
    
    }


}


public class Latihan3{

 public String returnHelloWorld(){
        return "Hello World!";
    }
    
    public static void main(String[] args ){
        Latihan3 example = new Latihan3();
        String result = example.returnHelloWorld();
        System.out.println(result);
    
    }



}


public class Latihan4{

    public static int multiply(int a, int b){
        int result = a * b;
        return result;
    }
    
    public static void main(String[] args ){
        int num1 = 5;
        int num2 = 10;
        
        
        Latihan4 example = new Latihan4();
        int product = example.multiply(num1, num2);
        System.out.println("The product of" + num1 +"and" + num2 +" is " + product);
    }




}


public class Latihan5{


    public void add(int x, int y){
        System.out.println(x+y);
    }
    
    public int add(int x, int y){
        return x + y;
    
    }
    
    public static void main(String[] args ){
        Latihan5 myClass = new Latihan5();
        myClass.add(1, 2);
    }
}

   '''
3. Overidding
   * yaitu teknik yg bisa membuat nama yang sama functionnya tetapi berbeda parameternya :D
