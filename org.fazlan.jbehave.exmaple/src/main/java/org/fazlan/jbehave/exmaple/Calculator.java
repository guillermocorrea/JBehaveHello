package org.fazlan.jbehave.exmaple;


public class Calculator {
    private int result;

    public void add(int number1, int number2) {
        result = number1 + number2;
    }

    public int getResult() {
        return result;
    }
}
