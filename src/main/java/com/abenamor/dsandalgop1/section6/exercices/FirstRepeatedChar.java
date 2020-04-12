package com.abenamor.dsandalgop1.section6.exercices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author abenamor on 10/04/2020
 */
public class FirstRepeatedChar {
    public Character getFirstRepeatedChar(String input) {
        Set<Character> inputToSet = new HashSet<>();
        char[] inputToChar = input.toCharArray();

        for (char elem: inputToChar ) {
            if (inputToSet.contains(elem)) {
                return elem;
            }
            inputToSet.add(elem);
        }
        return Character.MIN_VALUE;
    }
}
