package org.mb.calcl;

public class AnotherSwitchWithEnum7Operators {

    private enum Operators {
        PLUS("+") {

            int doOperation(int lhs, int rhs) {
                return lhs+rhs;
            }
            },
        MINUS("-"){
            int doOperation(int lhs, int rhs) {
                return lhs-rhs;
            }
        },
        ;

        private final String name;

        private Operators(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        abstract int doOperation(int lhs, int rhs);
    }

    public static void main(String[] args) throws Exception {
        Operators operator = Operators.MINUS;
        System.out.println(operator.doOperation(7, 14));

    }
}
