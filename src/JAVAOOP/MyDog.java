package JAVAOOP;

import java.util.Scanner;

public class MyDog {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Color: ");
        Dog.color = input.nextLine();

        System.out.print("Enter Weight: ");
        Dog.weight = input.nextFloat();

        Dog poodle = new Dog(Dog.color,Dog.weight);

        System.out.println("The color of my dog is "+ poodle.getColor());
        System.out.println("The weight of my dog is "+ poodle.getWeight());
    }
}
