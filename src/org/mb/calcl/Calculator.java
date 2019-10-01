package org.mb.calcl;

import java.util.Optional;
import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {

    Stack<Operators> operators;
    Stack<Integer> numbers;

    public Calculator(Stack<Operators> operators, Stack<Integer> numbers) {
        this.operators = operators;
        this.numbers = numbers;
    }

    public void popOperatorsAndNumbers() {

        Integer number1 = numbers.pop();
        Integer number2 = numbers.pop();
        Operators operator = operators.pop();
        Integer result = operator.doOperation(number2, number1);
        numbers.push(result);

    }

    public int calculate(String expression) {

        expression += " = ";
        StringTokenizer element = new StringTokenizer(expression);

        while (element.hasMoreElements()) {
            String item = String.valueOf(element.nextElement());
            System.out.println("operators: " + operators);
            System.out.println("numbers: " + numbers);
            System.out.println("item: " + item);

            if (isInteger(item)) {
                numbers.push(Integer.parseInt(item));
                continue;
            }
            Operators operator = parseOperator(item).get();
            if (operators.empty()) {
                operators.push(operator);

            } else {
               while((!operators.empty()) && (operator.getPriority() <= operators.peek().getPriority())) {
                    popOperatorsAndNumbers();
                }
                operators.push(operator);
            }

        }
        System.out.println("numbers: " + numbers);
        return numbers.pop();
    }

    public boolean isInteger(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isOperator(String arg) {
        return !parseOperator(arg).isPresent();
    }


    public Optional<Operators> parseOperator(String arg) {
        for (Operators operator : Operators.values()) {

            if (operator.getName().equals(arg)) {
                return Optional.of(operator);
            }
        }
        return Optional.empty();
    }

}
