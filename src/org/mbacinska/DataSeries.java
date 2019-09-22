package org.mbacinska;

import java.util.*;

public class DataSeries {

    public static void main(String[] args) {


        final List<Integer> numbers = prepareNumbers();

        System.out.println("Entire numbers: " + numbers);

        final List<String> words = prepareWords();

        System.out.println("Entire words:   " + words);


        findUniqueRandoms(numbers);
        iterateThroughWords(words);
        backIterateThroughWords(words);
        backIterateThroughWords2(words);
        iterateThroughNumbersWords(numbers, words);
        iterateThroughTwoNumbers(numbers);
        Map<String, Integer> newMap = associateWordsAndNumbers(numbers, words);
        System.out.println(newMap);
        System.out.println(newMap.get("elit"));
        System.out.println(newMap.get("sapien"));


    }

    private static List<Integer> prepareNumbers() {
        List<Integer> result = Arrays.asList(2, 0, 3, 8, 4, 6, 0, 2, 0, 7);
        result = Collections.unmodifiableList(result);
        return result;
    }

    private static List<String> prepareWords() {
        List<String> result = Arrays.asList("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "vivamus", "sapien");
        result = Collections.unmodifiableList(result);
        return result;
    }


    private static void findUniqueRandoms(List<Integer> numbers) {

        Set<Integer> result = new HashSet<>();

        for (Integer number : numbers) {
            result.add(number);
        }

        //lub
        //Set<Integer> result = new HashSet<>(numbers);

        System.out.println("Result : " + result);

    }

    private static void iterateThroughWords(List<String> words) {

        System.out.print("Result:          ");

        Iterator<String> iterator = words.iterator();
        // String element = iterator.next();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }


    private static void backIterateThroughWords(List<String> words) {

        System.out.print("Result:          ");

        ListIterator<String> iterator = words.listIterator(words.size());
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.print(element + "  ");
        }
        System.out.println();

    }

    private static void backIterateThroughWords2(List<String> words) {

        Stack<String> wordsInStack = new Stack<>();

        for (String element : words) {

            wordsInStack.push(element);
        }

        while (!wordsInStack.isEmpty()) {

            System.out.print(wordsInStack.pop() + " ");
        }
    }

    private static void iterateThroughNumbersWords(List<Integer> numbers, List<String> words) {

        Iterator<Integer> numIter = numbers.iterator();
        Iterator<String> wordsIter = words.iterator();

        while (numIter.hasNext() && wordsIter.hasNext()) {

            Integer number = numIter.next();
            String word = wordsIter.next();

            System.out.print("( " + number + " : " + word + " ) ");
        }


    }

    private static void iterateThroughTwoNumbers(List<Integer> numbers) {

        Iterator<Integer> num1 = numbers.iterator();

        while (num1.hasNext()) {

            Integer number1 = num1.next();
            Integer number2 = num1.next();


            System.out.print("( " + number1 + " : " + number2 + " ) ");

        }
    }

    private static Map<String, Integer> associateWordsAndNumbers(List<Integer> numbers, List<String> words) {

        Map<String, Integer> dict = new HashMap<>();

        Iterator<Integer> numIter = numbers.iterator();
        Iterator<String> wordsIter = words.iterator();

        while (numIter.hasNext() && wordsIter.hasNext()) {

            Integer number = numIter.next();
            String word = wordsIter.next();


            dict.put(word, number);


        }
        return dict;
    }


}








