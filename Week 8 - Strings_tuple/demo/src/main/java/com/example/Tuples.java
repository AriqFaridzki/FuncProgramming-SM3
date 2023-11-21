package com.example;
import org.javatuples.*;

public class Tuples {
    public static void main(String[] args) {
        Triplet<String, String, String> tuple1 = Triplet.with("Mangga", "Jambu", "Melon");

        Pair<String, String> tuple2 = tuple1.removeFrom0();
        Pair<String, String> tuple3 = tuple1.removeFrom1();

        System.out.println("Original Tuple: " + tuple1);    
        System.out.println("Hapus Elemen Pada Index 0: " + tuple2);    
        System.out.println("Hapus Elemen Pada Index 1: " + tuple3);


        Triplet<String, String, String> tupleIndex2Edit= tuple1.setAt2("Anggur");

        System.out.println("Setelah di ubah di index 2 : " + tupleIndex2Edit);

        Quartet<String, String, Integer, Integer> buahWithJumlah = buahWithJumlah.add(tuple2);
        

        
        // System.out.println("Setelah Di extend menjadi 5 slot buah :"+buah5);
    }
}
