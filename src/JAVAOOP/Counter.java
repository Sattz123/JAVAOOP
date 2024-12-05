package JAVAOOP;

public class Counter {
    private int count;

    Counter(){
        count = 0;
    }

    public void Click(){
        count++;
    }

    public int getCount(){
        return count;
    }

    public void reset(){
        count = 0;
    }

}
