package JAVAOOP.lab_12;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original list: " + numbers);

        shuffle(numbers);

        System.out.println("Shuffled list: " + numbers);
    }
}