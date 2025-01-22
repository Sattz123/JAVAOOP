package JAVAOOP;

import java.util.ArrayList;
import java.util.Date;

class Loan {
    @Override
    public String toString() {
        return super.toString(); 
    }
}

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan()); 
        list.add("ABC");     
        list.add(new Date(1675602476000L));  

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
