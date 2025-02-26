package JAVAOOP.lab_12;

import java.util.ArrayList;
import java.util.Collections;

public class MinElementArraytList {
    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        return Collections.min(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(4);

        System.out.println("The smallest element is: " + min(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("Peach");
        words.add("Apple");
        words.add("Orange");
        words.add("Banana");

        System.out.println("The smallest element is: " + min(words));
    }
}
