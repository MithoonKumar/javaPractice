package org.example.MicsConcepts;

import java.util.HashMap;

public class HashMapCreation extends Object {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(8, "Arti");
        System.out.println(hashMap.containsKey(8));
        System.out.println(hashMap.hashCode());

        int integer = 8;
        System.out.println();

        return;
    }

}
