package collections;

import jdk.security.jarsigner.JarSigner;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        HashMap<Integer, String > hashMap = new HashMap<>();
        hashMap.put(1, "Bangladesh");
        hashMap.put(2, "USA");
        hashMap.put(3, "France");
        System.out.println(hashMap.get(2));

        System.out.println("********************");

        for(int key:hashMap.keySet()){
            System.out.println(hashMap.get(key));
        }

        System.out.println("********************");

        Map<Integer, String> treeMap= new TreeMap<>();
        treeMap.put(1, "Bangladesh");
        treeMap.put(5, "USA");
        treeMap.put(3, "France");
        System.out.println( treeMap.get(5) + "********************");
        for(int key:hashMap.keySet()){
            System.out.println(hashMap.get(key));
        }

        System.out.println("********************");

        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "Bangladesh");
        linkedMap.put(2, "USA");
        linkedMap.put(3, "France");

        for(int key:linkedMap.keySet()){
            System.out.println(hashMap.get(key));
        }
        System.out.println("********************");


    }
}
