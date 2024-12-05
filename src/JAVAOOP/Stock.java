package JAVAOOP;

public class Stock {
    //Declare data fields
    private  String symbol;
    private  String name;
    private static double previousClosingPrice;
    private static double currentPrice;

    //Create a constructor with specific symbol and name
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    //Calculate the Change Percentage
    public static double getChangePercent(){
        return (((currentPrice-previousClosingPrice)/previousClosingPrice)*100);
    }

    //Get and Set Previous Closing Price
    public static double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double setPreviousClosingPrice(double sPCP){
        return previousClosingPrice = sPCP;
    }

    //Get and Set CurrentPrice
    public static double getCurrentPrice(){
        return currentPrice;
    }
    public double setCurrentPrice(double sCP){
        return currentPrice = sCP;
    }
}
