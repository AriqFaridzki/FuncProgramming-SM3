import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Functional {
    public static void main(String[] args) {
        System.out.println("Hello world ");



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
        
        return array.stream() // array dibuat mengantri(pipeline) satu per satu agar bisa diapply function lain

        .map(string -> string.toLowerCase()) // parameter array dibuat string menjadi huruf kecil agar konsisten

        .filter(string -> string.contains("@") && string.contains(searchArgs.toLowerCase()))
        // jika string yang dicari berisikan "@" dan kriteria data yang dicari

        .collect(Collectors.toList());
        // setelah selesai di filter maka akan di convert kembali menjadi tipe data List<String>
        }

          /**
         * Mencari email dengan string biasa - Imperative Way
         * 
         * @param array data emailnya
         * @param searchArgs kriteria data yang ingin dicari
         * @return array List tipe String
         */
        static List<String> findEmailImperative (List<String> array, String searchArgs){
            List<String> result = new ArrayList<>(); // membuat array baru untuk menampung data

            for (int i = 0; i < array.size(); i++) { // loop setiap data yang ada di array
                String email = array.get(i).toLowerCase(); // mengambil data dan diubah menjadi huruf kecil
                if (email.contains("@") && email.contains(searchArgs.toLowerCase())) { 
                    //jika variable email terdapat "@" dan kriteria data yang dicari

                    result.add(array.get(i).toLowerCase());
                    // maka tambahkan ke array penampungan (result)
                }
            }
            
            return result; // setelah itu di return setelah loop selesai
        }


    }
