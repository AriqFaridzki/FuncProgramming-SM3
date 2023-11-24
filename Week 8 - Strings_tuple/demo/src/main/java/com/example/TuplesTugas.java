package com.example;
import org.javatuples.*;
import java.util.*;

// Buatlah Tuple dengan tipe data yang berbeda-beda, bisa diupdate, dihapus dan ditambah

public class TuplesTugas {
    
    public static Pair<Integer, JenisMetric> editValue(Pair<Integer, JenisMetric> tuple, int value){
        return tuple.setAt0(value);
    }

    public static Pair<Integer, JenisMetric> editMetric(Pair<Integer, JenisMetric> tuple, JenisMetric value){
        return tuple.setAt1(value);
    }

    public static void removeValue(Pair<Integer, JenisMetric> tuple){
        tuple.removeFrom0();
    }
    
    public static Triplet<Integer, JenisMetric, Boolean> extendMetricDetail (Pair<Integer, JenisMetric> tuple, Boolean status){
        Triplet<Integer, JenisMetric, Boolean> tuplesTriplet = tuple.add(status);

        return tuplesTriplet;
    }

    public static void main(String[] args) {
        JenisMetric kg = new JenisMetric("Kilogram", "Untuk Mengukur Satuan Kilogram");
        JenisMetric gr = new JenisMetric("gram", "Untuk Mengukur Satuan Gram");

        Pair<Integer, JenisMetric > tuples = Pair.with(1, kg);

        Pair<Integer, JenisMetric > tuple2 = Pair.with(1, gr);

        Pair<Integer, JenisMetric > editedValueTuple = editValue(tuples, 20);
        Pair<Integer, JenisMetric > editedMetricTuple = editMetric(tuples, gr);

        removeValue(tuples);

        Triplet<Integer, JenisMetric, Boolean> extendedTuple = extendMetricDetail(tuple2, true);


        System.out.println("Hasil Regular : " + tuples);
        System.out.println("Hasil setelah Di Edit Value   : " + editedValueTuple);
        System.out.println("Hasil setelah Di Edit Metric  : " + editedMetricTuple);
        System.out.println("Hasil Setelah Hapus Value : " + tuples);
        System.out.println("Hasil Setelah Nambah tuple : " + extendedTuple);


    }

}



