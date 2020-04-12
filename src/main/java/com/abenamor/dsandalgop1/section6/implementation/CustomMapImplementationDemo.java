package com.abenamor.dsandalgop1.section6.implementation;

/**
 * @author abenamor on 12/04/2020
 */
public class CustomMapImplementationDemo {
    public static void main(String[] args) {
        CustomMapImplementation customMap = new CustomMapImplementation(10);
        customMap.put(11, "Adem");
        customMap.put(21, "Mosh");
        customMap.put(11, "Oracle");
        System.out.println(customMap);

        System.out.println("customMap.get(21): " + customMap.get(21));
       // System.out.println("customMap.get(11): " + customMap.get(11));

       // System.out.println("Remove 11: " + customMap.remove(11));
        System.out.println("Remove 20: " + customMap.remove(20));
        System.out.println(customMap);
    }
}
