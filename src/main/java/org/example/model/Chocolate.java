package org.example.model;

public class Chocolate extends ProductForSale{
    private double milkPercent;

    public Chocolate(String type, double price, String description, double milkPercent) {
        super(type, price, description);
        this.milkPercent = milkPercent;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public double getMilkPercent() {
        return milkPercent;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Milk Percent: " + getMilkPercent());
    }
}
