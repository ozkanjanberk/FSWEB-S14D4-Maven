package org.example.model;

public class Coke extends ProductForSale{
    private double totalVolume;

    public Coke(String type, double price, String description, double totalVolume) {
        super(type, price, description);
        this.totalVolume = totalVolume;
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Total Volume: " + getTotalVolume() + "ml");
    }
}
