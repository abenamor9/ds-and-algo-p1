package com.abenamor.dsandalgop1.section6.hash;

/**
 * @author abenamor on 10/04/2020
 */
public class HashDemo {
    public static void main(String[] args) {
        /*String temp = "dhgslkd";
        System.out.println("hash code: " + temp.hashCode());
        Integer key = 8745;
        System.out.println(hash(key));

        String element = "Adem54712dgdgd";
        System.out.println(hashChar(element));*/
        System.out.println(hash(22));
        System.out.println(hash(12));

    }

    public static Integer hashChar(String input) {
        int hValue = 0;
        for (char elem: input.toCharArray()) {
            hValue +=elem;
        }
        System.out.println("hash value for " + input + " is : " + hValue);
        return hValue %100;
    }
    // we supposed that our array has 100 as limit
    public static Integer hash(Integer input) {
        return input % 10;
    }
}
