package org.mb.calcl;

public enum Operators {

    PLUS(0, "+") {
        int doOperation(int lhs, int rhs) {
            return lhs + rhs;
        }
    },
    MINUS(0, "-") {
        int doOperation(int lhs, int rhs) {
            return lhs - rhs;
        }
    },
    MULTIPLY(1, "*") {
        int doOperation(int lhs, int rhs) {
            return lhs * rhs;

        }
    },
    DIVIDE(1, "/") {
        int doOperation(int lhs, int rhs) {
            return lhs / rhs;
        }
    },
    DONE(-1, "=") {
        int doOperation(int lhs, int rhs) {
            return -15100900;
        }
    };

    private final String name;
    private final int priority;

    abstract int doOperation(int lhs, int rhs);


    Operators(int priority, String name){
        this.name =name;
        this.priority = priority;

    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
