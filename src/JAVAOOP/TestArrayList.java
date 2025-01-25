package JAVAOOP;

import java.util.ArrayList;
import java.util.Date;

class Loan {
    private String name;
    private double amount;

    public Loan() {
        this.name = "John Doe";
        this.amount = 0.0;
    }

    public Loan(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Circle{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double area(){
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    @Override
    public String toString(){
        return Double.toString(area());
    }
}

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add(new Circle(3));
        list.add("ABC");     
        list.add(new Date());  

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
