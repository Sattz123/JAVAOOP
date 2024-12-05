package JAVAOOP;

public class CounterTest {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.Click();
        c1.Click();
        System.out.println("c1 current count: "+ c1.getCount());

        c1.reset();
        System.out.println("c1 count after reset: "+c1.getCount());

        c2.Click();
        c2.Click();
        c2.Click();
        System.out.println("c2 current count: "+c2.getCount());

        c2.reset();
        System.out.println("c2 count after reset: "+c2.getCount());
    }
}
