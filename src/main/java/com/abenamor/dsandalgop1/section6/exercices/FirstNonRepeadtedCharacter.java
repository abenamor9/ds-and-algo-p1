package com.abenamor.dsandalgop1.section6.exercices;

import java.sql.PreparedStatement;
import java.util.*;

/**
 * @author abenamor on 10/04/2020
 */
public class FirstNonRepeadtedCharacter {

    public Character getTheFirstNonRepeatedCharacter(String input) {
        Character firstNonRepeadted = null;
        Map<Character, Integer> inputToMap = new LinkedHashMap<>();
        Integer occurence = null;
        for (char item: input.toCharArray()) {
             occurence = inputToMap.containsKey(item)? inputToMap.get(item) : 0;
            inputToMap.put(item, occurence + 1);
        }

        for (Character key : inputToMap.keySet()) {
            if (inputToMap.get(key) == 1) {
                firstNonRepeadted = key;
                break;
            }
        }


        return firstNonRepeadted;
    }
}
