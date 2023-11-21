package com.example;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        
        List<Book> list = new ArrayList<Book>();
        
        Book b1=new Book(101,"Java Programming","Eric","Elexindo",10);
        Book b2=new Book(102,"Database Fundamental","John","Kompas",5);
        Book b3=new Book(103,"Linux","Calvin","Gramedia",6);


        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(Book b:list){
            System.out.println(b.id+" " +b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        
    }    
}


// 1. yang saya pelajari dari praktikum ini adalah :
//     * kita membuat sebuah class yaitu yang isinya untuk menampung data yang sudah ditentukan
//     * saat membuat data baru, kita tinggal instansiasi object baru untuk menampung datanya, ini membuat data menjadi rapih
//     * setelah itu kita membuat list dengan tipe datanya class Book, yang artinya List itu hanya menampung data object dari class Book
//     * setelah itu kita menambahkan list tersebut dengan menggunakan method .add(object Book hasil instansiasi tadi)
//     * setelah itu tinggal di loop untuk mengeluarkan datanya.