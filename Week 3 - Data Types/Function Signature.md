# Function Signature

ciri khas pembuatan function dalam java

## syntax function
modifier(opsional) static(opsional) return_type method_name parameter_list

### Example

1. Method Signature tanpa Parameter dan tanpa mengembalikan type 
  ```java
  public class HelloWorld {
    public static void main(String[] args) {
           
      HelloWorld hello = new HelloWorld();
      hello.printHello();
        
        }
        
    public void printHello(){
      System.out.println("Hello World");
    }
}
```

2. Method Signature dengan Parameter dan tanpa  mengembalikan type
```java
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
```

3. Method Signature tanpa Parameter dan mengembalikan type
```java
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
```

4. Method Signature dengan Parameter dan mengembalikan type
```java
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
```

## java uniqueness
1. polymorphism
   * yaitu satu method yang bisa di modifikasi lagi dengan isi fungsi yang berbeda dari original ( kayak interface )


3. Overloading
   * yaitu teknik yg bisa membuat nama yang sama functionnya tetapi berbeda parameternya :D
```java
public class Latihan5{
    public void add(int x, int y){
        System.out.println(x+y);
    }
    // add :: Number -> Number -> Number (hasil return pada terakhir) 
    public int add(int x, int y){ 
        return x + y;
    
    }
  
    public static void main(String[] args ){
        Latihan5 myClass = new Latihan5();
        myClass.add(1, 2); // parameter sama :D jadi error
    }
}

// harusnya parameter diubah dan return type bisa diubah juga :D
```

> Tugas : buatlah analisa kenapa Latihan5 error, overloading method *sertakan link sumber jika mereferensikan \
> Tips : tambahkan komen seperti add :: Number -> Number -> Number :D ( type signature thingy ) \
> Deadline : 16-10-2023
