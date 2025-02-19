package JAVAOOP.lab_09;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexHandling {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1_000_000_000);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter index of array (0 - 99): ");
        try {
            int index = scanner.nextInt();
            System.out.println("The value at index " + index + " is " + numbers[index] + ".");
            System.out.println("End nicely.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You refer to an index that does not exist.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        System.out.println("Continuing processing ...");
        scanner.close();
    }
}