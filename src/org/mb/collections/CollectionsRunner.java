package org.mb.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CollectionsRunner {

    public void run (String[] args){

        List<String> words = new ArrayList<>();
        words.add("Ala");
        words.add("Ola");
        words.add("Ela");

        System.out.println(words.toString());

        System.out.println(words.size());

        words.remove(0);

        System.out.println(words.toString());

        System.out.println(words.size());

        words.clear();

        System.out.println(words.size());

        System.out.println(words.toString());

        List<String> linkedList = new LinkedList<>();

        Stack<String> wordsInStack = new Stack<>();

        System.out.println(wordsInStack.empty());

        //dodaj do stosu
        wordsInStack.push("Kot");

        wordsInStack.push("Pies");

        wordsInStack.push("Ryba");

        //usun ze stosu ostatni element i wyswietl
        System.out.println(wordsInStack.pop());

        System.out.println(wordsInStack.pop());

        System.out.println(wordsInStack.pop());


    }
}
