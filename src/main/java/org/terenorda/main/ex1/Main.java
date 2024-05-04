package org.terenorda.main.ex1;

public class Main {
    public static void main(String[] args) {
        // Creating stocks
        Stock stock1 = new Stock("AAPL", 150.0);
        Stock stock2 = new Stock("GOOGL", 2500.0);

        // Creating investors
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");



        investor1.investInStock(stock1);
        investor2.investInStock(stock1);
        investor2.investInStock(stock2);

        stock1.updatePrice(155.0);
        stock2.updatePrice(2600.0);

        investor2.divestFromStock(stock1);

        stock1.updatePrice(160.0);
        stock2.updatePrice(2650.0);
    }
}
