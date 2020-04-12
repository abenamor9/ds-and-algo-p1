package com.abenamor.dsandalgop1.section6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abenamor on 10/04/2020
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Adem");
        map.put(2, null);
        map.put(3, "Mosh");
        map.put(null, null);
        map.remove(1);
        System.out.println("map.get(2):  " + map.get(2));
        System.out.println("map.get(55) : " + map.get(55));
        System.out.println("map.containsKey(2): " + map.containsKey(2));
        System.out.println("map.containsKey(55): " + map.containsKey(55));
        System.out.println("---------------");
        for (Integer elem: map.keySet()) {
            System.out.println(elem);
        }
        // O(1)
       System.out.println("contain 3: " + map.containsKey(3));
        // O(n)
        System.out.println("contain value: " + map.containsValue("Bru"));

        for (Map.Entry<Integer, String> elem: map.entrySet()) {
            System.out.println(elem);
        }



    }
}
