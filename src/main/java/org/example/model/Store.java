package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[] {
                new Chocolate("Chocolate", 2.5, "Delicious dark chocolate", 75.0),
                new Coke("Coke", 1.5, "Refreshing beverage", 500),
                new Bread("Bread", 1.0, "Whole grain bread", "Large")
        };


    }

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
    }
