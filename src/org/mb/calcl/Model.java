package org.mb.calcl;

import java.util.Stack;

public class Model {

    private Stack<Operators> operators;
    private Stack<Integer> numbers;

    public Model() {
        this.operators = new Stack<>();
        this.numbers = new Stack<>();
    }

    public Stack<Operators> getOperators() {
        return operators;
    }

    public Stack<Integer> getNumbers() {
        return numbers;
    }
}
