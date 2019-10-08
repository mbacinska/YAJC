package org.mb.calcl;

import java.util.Optional;
import java.util.StringTokenizer;

public class Calculator {

    Model model;

    public Calculator(Model model) {
        this.model = model;
    }

    public void popOperatorsAndNumbers() {

        Integer number1 = model.getNumbers().pop();
        Integer number2 = model.getNumbers().pop();
        Operators operator = model.getOperators().pop();
        Integer result = operator.doOperation(number2, number1);
        model.getNumbers().push(result);

    }

    public int calculate(String expression) {

        expression += " = ";
        StringTokenizer element = new StringTokenizer(expression);

        while (element.hasMoreElements()) {
            String item = String.valueOf(element.nextElement());
            System.out.println("operators: " + model.getOperators());
            System.out.println("numbers: " + model.getNumbers());
            System.out.println("item: " + item);

            if (isInteger(item)) {
                model.getNumbers().push(Integer.parseInt(item));
                continue;
            }
            Operators operator = parseOperator(item).get();
            if (model.getOperators().empty()) {
               model.getOperators().push(operator);

            } else {
                while ((!model.getOperators().empty()) && (operator.getPriority() <= model.getOperators().peek().getPriority())) {
                    popOperatorsAndNumbers();
                }
                model.getOperators().push(operator);
            }

        }
        System.out.println("numbers: " + model.getNumbers());
        return model.getNumbers().pop();
    }

    public boolean isInteger(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
