package com.mikola.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.mikola.calculator.Calculator;

import java.io.IOException;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddShouldAddPositiveNumbers() {
        //given
        int expected = 3;
        //when
        int actual = calculator.add(1,2);
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testAddShouldAddNegativeNumbers() {
        //given
        int expected = -10;
        //when
        int actual = calculator.add(-5,-5);
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSubstractShouldSubstractPositiveNumbers() {
        int expected = 3;
        int actual = calculator.substract(7,4);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSubstractShouldSubstractNegativeNumbers() {
        int expected = 0;
        int actual = calculator.substract(-5,-5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testMultiplyShouldMultiplyPositiveNumbers() {
        int expected = 3;
        int actual = calculator.multiply(1,3);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testMultiplyShouldMultiplyNegativeNumbers() {
        int expected = 10;
        int actual = calculator.multiply(-2,-5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDivideShouldDevidePositiveNumbers() {
        int expected = 3;
        int actual = calculator.divide(9,3);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDivideShouldDevideNegativeNumbers() {
        int expected = 10;
        int actual = calculator.divide(-20,-2);
        Assertions.assertEquals(expected,actual);
    }


}
