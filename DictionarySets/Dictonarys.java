package DictionarySets;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;



public class Dictonarys {
    public static void main(String[] args) {
        Dictionary <String, Integer> myDict = new Hashtable<>();
        myDict.put("Apel", 1);
        myDict.put("Pisang", 2);
        myDict.put("Anggur", 3);


        Enumeration<String> keys = myDict.keys();

        for (String key = keys.nextElement(); keys.hasMoreElements();){
            System.out.println("Keys in Dictionary : " + keys.nextElement() + " Value: "   +myDict.get(key));
        }

        System.out.println("\nSize of Dictionary : " + myDict.size());
        System.out.println("\nRemove : " + myDict.remove("Apel"));

        Enumeration<String> key2 = myDict.keys();

        while (key2.hasMoreElements()) {
            String key = key2.nextElement();
            System.out.println("Key: " + key + ", Value: " + myDict.get(key));
        }
        
        System.out.println("\nSize of Dictionary : " + myDict.size());
    }

}