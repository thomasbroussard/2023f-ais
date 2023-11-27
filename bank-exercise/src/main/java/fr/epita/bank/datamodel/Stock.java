package fr.epita.bank.datamodel;

public class Stock {
    private String name;
    private double currentPrice;

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Stock(String name, double value) {
        this.name = name;
        this.currentPrice = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
