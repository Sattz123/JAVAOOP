package JAVAOOP;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        for(int i = 0 ; i < 8;i++){
            long elapseTime = 10000 *((long)Math.pow(10,i));

            Date date = new Date(elapseTime);

            System.out.println(date.toString());

            elapseTime = 10000;
        }
    }
}
