package com.mc.randomizer.common;

import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RandomTypesGenTest {

    private final RandomTypesGenerator randomTypesGenerator = new RandomTypesGenerator();

    @Test
    void getRandomLongTest() {
        val min = -42;
        val max = 55;
        val result = randomTypesGenerator.randomLong(min, max);
        assert result >= min && result <= max : assertionMessage(result, "[-42; 55]");
    }

    @Test
    void getRandomLongInclusiveTest() {
        val inclusive = 43;
        val result = randomTypesGenerator.randomLong(inclusive, inclusive);
        assert result == inclusive : assertionMessage(result, "[43; 43]");
    }

    @Test
    void boundExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> randomTypesGenerator.randomLong(45, 33));
    }

    private static String assertionMessage(Long result, String expected) {
        return "Given result [" + result + "]  is not in [" + expected + "] expected range";
    }
}
