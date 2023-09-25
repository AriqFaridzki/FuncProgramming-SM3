# Functinal Programming


### Declarative Languagge
FP masuk dalam kategori ini yang artinya dalam paradigma (sistem) ini bagaimana 
kode kita itu dijabarkan **apa yang mau kita capai** tanpa menjelaskan **control flow (prosesnya)**

>  for the same input arguments, the program produces the same result. The order of execution of statements is not important in the declarative programming paradigm. - [scaler.com](https://www.scaler.com/topics/java/functional-programming-in-java/)

contoh

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};

        int[] evenArray  = Arrays.stream(array)
                .filter(a -> a % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(evenArray));
    }
}
```

### Perbedaaan Functional Programming & Purely Functional Programming  

### Karakteristik
#### First Class Citizens

In Functional programming, functions are considered first-class citizens. A function is called a first-class citizen if it can be:

* stored in a variable
* passed as an argument to a function
* returned as a value from other functions

All these operations are achieved using functional interfaces introduced in Java 8.

#### Functional Interfaces
#### java.util.function.Function

#### method reference in java
https://www.scaler.com/topics/method-reference-in-java/