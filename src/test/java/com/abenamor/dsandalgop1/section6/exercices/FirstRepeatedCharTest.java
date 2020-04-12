package com.abenamor.dsandalgop1.section6.exercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author abenamor on 10/04/2020
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstRepeatedCharTest {

    private FirstRepeatedChar firstRepeatedChar;

    @BeforeAll
    public void init() {
        firstRepeatedChar = new FirstRepeatedChar();
    }

    @Test
    public void givenInput_then_Sucess() {
        Assertions.assertTrue('e' == firstRepeatedChar.getFirstRepeatedChar("green apple"));
        Assertions.assertTrue(Character.MIN_VALUE == firstRepeatedChar.getFirstRepeatedChar("abcdefgh"));

    }

}
