package com.abenamor.dsandalgop1.section6.exercices.lesson20;

import javax.net.ssl.SSLContext;
import java.util.HashMap;
import java.util.Map;

/**
 * @author abenamor on 13/04/2020
 */
public class HashTableExercise {

    /**
     * Time complexity = O(n)
     * @param input
     * @return
     */
    public Integer mostFrequentElementInAnArray(Integer[] input) {

        if (input == null | input.length == 0) {
            throw new IllegalStateException("Input must not be empty ");
        }

        Map<Integer, Integer> occurences = new HashMap<>();

        // Fill the map
        Integer nbrOccur = 0;
        for (Integer elem: input) {
            nbrOccur = (occurences.containsKey(elem)) ? occurences.get(elem) : 0;
            occurences.put(elem, nbrOccur + 1);
        }

        System.out.println("Map: " + occurences);

        // get the max value in the map
        Integer mostNumRepeated = 1;
        Integer result = input[0];
        for (Integer current : occurences.keySet()) {
            if (occurences.get(current) > mostNumRepeated) {
                result = current;
                mostNumRepeated = occurences.get(current);
            }
        }

        return result;
    }

    public String mostFrequentWordInSentence(String sentence) {
        if (sentence == null)
            throw  new IllegalArgumentException("Input must not be null");

       String[] words = sentence.split(" ");

       Map<String, Integer> wordNbrOccurenceMap = new HashMap<>();

       Integer wordNbrOccur = 0;
       for (String word: words) {
           wordNbrOccur = (wordNbrOccurenceMap.containsKey(word)) ? wordNbrOccurenceMap.get(word) : 0;
           wordNbrOccurenceMap.put(word, wordNbrOccur + 1);
       }

       String result=null;
       Integer maxWordOccur = 0;
        for (String wordKey: wordNbrOccurenceMap.keySet()) {
            if (wordNbrOccurenceMap.get(wordKey) > maxWordOccur) {
                result = wordKey;
                maxWordOccur = wordNbrOccurenceMap.get(wordKey);
            }
        }

        return result;
    }

    /**
     * Time complexity = O(n^2)
     * @param input
     * @param k
     * @return
     */
    public int countPairsWithDiff(Integer[] input, int k) {
        Map<Integer, Integer> kDiffPairs = new HashMap<>();

        for (int i=0; i< input.length; i++) {
            for (int j=0; j<input.length; j++) {
                if (input[i] + k == input[j]) {
                    kDiffPairs.put(input[i], input[j]);
                }
            }
        }

        System.out.println(kDiffPairs);

        return kDiffPairs.size();
    }

    public Map<Integer, Integer> twoSum(Integer[] array, Integer target) {

        Map<Integer, Integer> result = new HashMap<>();

        for (int i=0; i< array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] + array[j] == target) {
                    result.put(i,j);
                }
            }
        }

        System.out.println(result);

        return result;
    }
}
