package JAVAOOP.lab_09;

import java.util.Scanner;

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInteger(scanner, "Enter an integer: ");
        int num2 = getInteger(scanner, "Enter an integer: ");
        
        System.out.println("The number entered is " + (num1 + num2));
        scanner.close();
    }

    public static int getInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                scanner.next();
            }
        }
    }
}
