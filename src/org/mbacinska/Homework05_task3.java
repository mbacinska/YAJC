package org.mbacinska;


import java.util.ArrayList;
import java.util.Stack;


public class Homework05_task3 {

    final static int stackSize = 6;
    static Stack<Integer> integerStack = new Stack<>();
    static Stack<Integer> integerStack2 = new Stack<>();
    static ArrayList<Integer> list = new ArrayList<>();


    public static void main(String[] args) {


        createStack(stackSize);

        printStack3(integerStack);


        System.out.println("***************");

        createStack2(stackSize);

        printStack3(integerStack2);

        System.out.println("***************");

        initializeList(integerStack, integerStack2);


    }

    public static void createStack(int stackSize) {


        for (int i = 0; i < stackSize; i++) {

            integerStack.push(i);


        }


        //System.out.println(integerStack.size());

    }


//    public static void createStack2(int stackSize) {
//
//
//        for (int i =-(stackSize-1); i <= 0; i++) {
//
//            integerStack2.push(i);
//
//
//        }
//
//        System.out.println(integerStack2.size());
//
//           }

    public static void createStack2(int stackSize) {


        for (int i = stackSize - 1; i >= 0; i--) {

            integerStack2.push(-i);


        }

       // System.out.println(integerStack2.size());

    }


    public static void printStack3(Stack<Integer> stack) {


        System.out.println(stack);

    }

    public static void initializeList(Stack<Integer> stack, Stack<Integer> stack2) {


        while (!stack.isEmpty() || !stack2.isEmpty()) {

            list.add(stack.pop());
            list.add(stack2.pop());

        }

        System.out.println(list.size());
        System.out.println(list.toString());
    }


}
