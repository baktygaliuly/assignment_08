package org.terenorda.main.ex1;

import java.util.ArrayList;
import java.util.List;

class Investor {
    private String name;
    private List<Stock> stocks;

    public Investor(String name) {
        this.name = name;
        this.stocks = new ArrayList<>();
    }

    public void update(Stock stock) {
        System.out.println("Investor " + name + " received update for stock " + stock.getSymbol() + ". New price: " + stock.getPrice());
    }

    public void investInStock(Stock stock) {
        stocks.add(stock);
        stock.registerInvestor(this);
    }

    public void divestFromStock(Stock stock) {
        stocks.remove(stock);
        stock.unregisterInvestor(this);
    }
}
