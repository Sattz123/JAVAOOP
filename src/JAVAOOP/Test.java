package JAVAOOP;

public class Test {
    public static void main(String[] args){
        //Create an object
        Stock test = new Stock("ORCL","Oracle Corporation");

        //Set stock's value
        test.setPreviousClosingPrice(34.5);
        test.setCurrentPrice(34.35);

        //Display price change percentage.
        System.out.println("Previous Closing Price: "+Stock.getPreviousClosingPrice());
        System.out.println("Current Price: "+ Stock.getCurrentPrice());
        System.out.println("Price Change: "+ Stock.getChangePercent()+"%");
    }
}
