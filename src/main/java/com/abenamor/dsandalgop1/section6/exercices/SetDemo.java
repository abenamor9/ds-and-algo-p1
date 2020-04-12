package com.abenamor.dsandalgop1.section6.exercices;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author abenamor on 10/04/2020
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Integer[] numbers = {1, 2, 3, 3, 2, 1, 4};
        set.addAll(Arrays.asList(numbers));
        System.out.println(set);
    }
}
