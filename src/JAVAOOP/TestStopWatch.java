package JAVAOOP;

public class TestStopWatch {
    public static void main(String[] args) {

        StopWatch time1 = new StopWatch();

        time1.start();
        for(int i=0; i<100000; i++){
            System.out.println("Hello java!");
        }
        time1.stop();

        System.out.println("The process time is "+ time1.getElapseTime(time1.getStartTime(), time1.getEndTime()));
    }
}
