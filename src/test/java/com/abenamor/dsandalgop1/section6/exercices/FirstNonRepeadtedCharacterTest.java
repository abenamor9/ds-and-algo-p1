package com.abenamor.dsandalgop1.section6.exercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author abenamor on 10/04/2020
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstNonRepeadtedCharacterTest {

    private FirstNonRepeadtedCharacter firstNonRepeadtedCharacter;

    @BeforeAll
    public void init() {
         firstNonRepeadtedCharacter = new FirstNonRepeadtedCharacter();
    }

    @Test
    public void given_StringInput_ThenSuccess() {
        Assertions.assertTrue('g' == firstNonRepeadtedCharacter.getTheFirstNonRepeatedCharacter("a green apple"));
        Assertions.assertTrue('y' == firstNonRepeadtedCharacter.getTheFirstNonRepeatedCharacter("my name is adem"));
        Assertions.assertTrue('m' == firstNonRepeadtedCharacter.getTheFirstNonRepeatedCharacter("i am software engineer"));
    }
}
