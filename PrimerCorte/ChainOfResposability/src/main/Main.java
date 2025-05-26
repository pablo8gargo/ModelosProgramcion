package main;

public class Main{
    public static void main(String[] args) {
        // Creating the chain
        Handler coinFifty = new CoinFiveHundred();
        Handler coinTwenty = new CoinTwoHundred();
        Handler coinTen = new CoinOneHundred();
        Handler coinTwo = new CoinFifty();

        // Linking the chain
        coinFifty.setNextHandler(coinTwenty);
        coinTwenty.setNextHandler(coinTen);
        coinTen.setNextHandler(coinTwo);

        // Test case
        int amount = 1875;
        System.out.println("Changing " + amount + " into coins:");
        coinFifty.handle(amount);
    }
}
