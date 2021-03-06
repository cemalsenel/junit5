package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01CalculatorTest {

    @Test
    @DisplayName("adds two numbers")
    void sum() {
        assertEquals(13,C01Calculator.sum(5,8));
        assertEquals(13,C01Calculator.sum(-5,18));
        assertEquals(-3,C01Calculator.sum(5,-8));
        assertEquals(-13,C01Calculator.sum(-5,-8));
    }

    @Test
    @DisplayName("multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(40,C01Calculator.multiply(5,8)),
                () ->assertEquals(-40,C01Calculator.multiply(-5,8)),
                () ->assertEquals(-40,C01Calculator.multiply(5,-8)),
                () ->assertEquals(40,C01Calculator.multiply(-5,-8)));


    }
}