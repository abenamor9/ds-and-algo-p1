package com.abenamor.dsandalgop1.section6.exercices.lesson20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abenamor on 13/04/2020
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HashTableExerciseTest {

    private HashTableExercise hashTableExercise;

    @BeforeAll
    public void init() {
        hashTableExercise = new HashTableExercise();
    }

    @Test
    public void given_arrayOfIntegers_thenSuccess() {
        Assertions.assertEquals(3, hashTableExercise.mostFrequentElementInAnArray(new Integer[]{1,2,2,3,3,3,4}));
        Assertions.assertEquals(3, hashTableExercise.mostFrequentElementInAnArray(new Integer[]{1,2,2,3,3,3,4,4,4}));
    }

    @Test
    public void given_sentence_thenReturnTheFrequentWord() {
        Assertions.assertEquals("adem",
                hashTableExercise.mostFrequentWordInSentence("adem is a sofrware enginer. adem is passionate adem"));
    }

    @Test
    public void givenInput_thenReturnSuccess() {
        Assertions.assertEquals(4,
                hashTableExercise.countPairsWithDiff(new Integer[]{1,7,5,9,2,12,3},2));
    }

    @Test
    public void givenInput_thengetIndices() {
        Map<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(0,1);
        Assertions.assertTrue(expectedResult.equals(hashTableExercise.twoSum(new Integer[]{2,7,11,15},9)));
    }
}
