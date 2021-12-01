package com.mikola.calculator;

import java.io.IOException;

public class Calculator {

    public Calculator() {

    }

    public int add(int first,int second) {
        return first + second;
    }

    public int takeAway(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first,  int second) throws IOException {
         if (second == 0) {
             throw new IOException("You can't divide by zero");
         }
         return first / second;
    }

}
