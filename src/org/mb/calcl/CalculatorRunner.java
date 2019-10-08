package org.mb.calcl;

import java.util.Stack;

public class CalculatorRunner {

    public static void main(String[] args) {

        String data = " 4 + 11 + 2 * 3 ";

        Model model = new Model();

        Calculator calculator = new Calculator(model);
        System.out.println(calculator.calculate(data));
    }


}
