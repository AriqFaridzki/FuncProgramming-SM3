package com.example;

public class strings {
    public static void main(String[] args) {
        String kata1 = "Hello";
        String kata2 = "Hai";

        System.out.println("Panjang String Pertama: " + kata1.length());

        System.out.println("Panjang String Kedua: " + kata2.length());


        String kataTergabung = kata1.concat(kata2);
        System.out.println("Kata Tergabung : " + kataTergabung);

        String gantiJadiH = kataTergabung.replace("H", "A");

        System.out.println(gantiJadiH);
    }
}

// 1. yang saya pelajari adalah : bahwa string itu mempunyai method .length untuk mengetahui berapa character yang ada di dalam variable tersebut, yang
// artinya juga bahwa string dalam java itu dianggap object dan itu bisa memanggil method bawaan dari java

// 2. 