package Week_5_HoF;

import java.util.function.BiFunction;
import java.util.function.Function;

public class persegi_HoF {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> luasLingkaran = functionFactory((x,y) -> x * y);
        BiFunction<Integer, Integer, Integer> kelilingLingkaran = functionFactory((x,y) -> 2 * (x + y) );

        BiFunction<Integer, Integer, Integer> luasLingkaran2 = luasLogic();
        BiFunction<Integer, Integer, Integer> kelilingLingkaran2 = kelilingLogic(2);




        Integer result = luasLingkaran.apply(5,7);
        System.out.println("Factory Functions : " +result);

        result = kelilingLingkaran.apply(8,4);
        System.out.println("Factory Functions : " + result);

        Integer result2 = luasLingkaran2.apply(5,7);
        System.out.println("Classic Methods : " + result2);

        result2 = kelilingLingkaran2.apply(8,4);
        System.out.println("Classic Methods : " + result2);
    }

    static BiFunction<Integer, Integer, Integer> luasLogic(){
        return (x,y) -> x * y;
    };

    static BiFunction<Integer, Integer, Integer> kelilingLogic(Integer fixedNumber){
        return (x,y) -> fixedNumber * (x + y);
    };

    static BiFunction<Integer, Integer, Integer> functionFactory(BiFunction<Integer, Integer, Integer> opArit){
        return opArit;
    }

}
