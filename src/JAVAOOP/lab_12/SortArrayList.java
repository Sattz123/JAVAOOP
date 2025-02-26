package JAVAOOP.lab_12;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Peach");
        words.add("Apple");
        words.add("Orange");
        words.add("Banana");
        words.add("Grape");

        System.out.println("Original list: " + words);

        sort(words);

        System.out.println("Sorted list: " + words);
    }
}
