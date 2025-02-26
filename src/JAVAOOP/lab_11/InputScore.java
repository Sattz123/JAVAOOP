package JAVAOOP.lab_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputScore {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Stewie\\Documents\\JAVA FILES\\JAVAOOP\\src\\JAVAOOP\\lab_11\\scores.txt");
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            int sum = 0, count = 0;

            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    sum += fileScanner.nextInt();
                    count++;
                } else {
                    fileScanner.next();
                }
            }

            if (count > 0) {
                System.out.println("Total: " + sum);
                System.out.println("Average: " + (sum / (double) count));
            } else {
                System.out.println("No valid scores found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file.");
        }
    }
}
