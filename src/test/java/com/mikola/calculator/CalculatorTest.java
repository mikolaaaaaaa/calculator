package com.mikola.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void firstTestAdd() {
        int expected = 3;
        int actual = calculator.add(1,2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void secondTestAdd() {
        int expected = 10;
        int actual = calculator.add(5,5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void firstTestTakeAway() {
        int expected = 3;
        int actual = calculator.takeAway(7,4);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void secondTestTakeAway() {
        int expected = 10;
        int actual = calculator.takeAway(15,5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void firstTestMultiply() {
        int expected = 3;
        int actual = calculator.multiply(1,3);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void secondTestMultiply() {
        int expected = 10;
        int actual = calculator.multiply(2,5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void firstTestDivide() throws IOException {
        int expected = 3;
        int actual = calculator.divide(9,3);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void secondTestDivide() throws IOException {
        int expected = 10;
        int actual = calculator.divide(20,2);
        Assertions.assertEquals(expected,actual);
    }


}
