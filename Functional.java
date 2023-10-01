import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Functional {
    public static void main(String[] args) {
        System.out.println("Hello world ");



        List<String> data = Arrays.asList("Ariq@gmail.com", "someone@ariq.com", "aere", "lmao", "dickyggaming@gmail.com");

        System.out.println(findEmailFuctional(data, "ar"));
        System.out.println(findEmailImperative(data, "ar"));

        
        };

        static List<String> findEmailFuctional (final List<String> array, final String searchArgs){
        
        return array.stream()
        .map(string -> string.toLowerCase())
        .filter(string -> string.contains("@") && string.contains(searchArgs.toLowerCase()))
        .collect(Collectors.toList());

        }

        static List<String> findEmailImperative (List<String> array, String searchArgs){
            List<String> result = new ArrayList<>();

            for (int i = 0; i < array.size(); i++) {
                String email = array.get(i).toLowerCase();
                if (email.contains("@") && email.contains(searchArgs.toLowerCase())) {

                    result.add(array.get(i).toLowerCase());
                }
            }
            
            return result;
        }


    }



 
/*
 * input : int n
 * Write a Java program to calculate the sum of all even, odd numbers in a list using streams. 
 * 
 * 1. buat list yang menampung result
 * 2. filter angka
 * 3. simpan angka + map langsung dengan menambahkannya :D 
 * 
 * 
 */