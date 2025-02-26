package JAVAOOP.lab_11;

import java.io.*;
import java.util.*;

public class ReadWrite {
    public static void main(String[] args) {
        String filename = "RWdata.txt";
        
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                writer.print(rand.nextInt(1000) + " ");
            }
            System.out.println("Random numbers written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file.");
            return;
        }

        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);
    }
}
