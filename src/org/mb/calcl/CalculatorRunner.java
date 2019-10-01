package org.mb.calcl;

import java.util.Stack;

public class CalculatorRunner {

    public static void main(String[] args) {

        Stack<Operators> operators = new Stack<>();
        Stack<Integer> numbers = new Stack<>();

        String data = " 4 + 11 + 2 * 3 ";

        Calculator calculator = new Calculator(operators,numbers);
        System.out.println(calculator.calculate(data));
    }


}
