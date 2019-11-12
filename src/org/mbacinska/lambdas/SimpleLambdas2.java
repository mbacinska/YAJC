package org.mbacinska.lambdas;

public class SimpleLambdas2 {

    interface Doable {
        void doSomething();
    }

    public static void main(String[] args) {
        Doable data = new Doable() {//data jest obiektem anonimowej klasy ktory implementuje interfejs Doable
            @Override
            public void doSomething() {
                System.out.println("Inside doSomething");
            }
        };
        data.doSomething();

    }
}
