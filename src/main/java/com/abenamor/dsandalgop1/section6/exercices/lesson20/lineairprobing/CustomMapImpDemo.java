package com.abenamor.dsandalgop1.section6.exercices.lesson20.lineairprobing;

/**
 * @author abenamor on 13/04/2020
 */
public class CustomMapImpDemo {
    public static void main(String[] args) {
        CustomMapImp customMapImp = new CustomMapImp(10);
        customMapImp.put(10, "Adem");
        customMapImp.put(1, "Bruno");
        System.out.println(customMapImp.toString());
        customMapImp.put(20, "Mosh");
        customMapImp.put(10, "Adem+");
        System.out.println(customMapImp.toString());

        System.out.println("customMapImp.get(20): " + customMapImp.get(20));

        System.out.println("customMapImp.remove(20): " + customMapImp.remove(20));
        System.out.println(customMapImp.toString());

    }
}
