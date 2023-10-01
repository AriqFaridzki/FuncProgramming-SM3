import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Functional {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("Ariq@gmail.com", "someone@ariq.com", "aere", "lmao", "dickyggaming@gmail.com");

        System.out.println(findEmailFuctional(data, "ar"));
        System.out.println(findEmailImperative(data, "ar"));

        };

        /**
         * Mencari email dengan string biasa - Functional Way
         * 
         * @param array data emailnya
         * @param searchArgs kriteria data yang ingin dicari
         * @return array List tipe String
         */
        
        static List<String> findEmailFuctional (final List<String> array, final String searchArgs){

        return array.stream()
        .map(string -> string.toLowerCase())
        .filter(string -> string.contains("@") && string.contains(searchArgs.toLowerCase()))
        .collect(Collectors.toList());
        
        }

        /**
         * Mencari email dengan string biasa - Imperative Way
         * 
         * @param array data emailnya
         * @param searchArgs kriteria data yang ingin dicari
         * @return array List tipe String
         */
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
