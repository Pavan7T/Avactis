package com.avactis.utils;

public class Product {
    private String category;
    private String productName;
    private int quantity;

    public Product(String category, String productName, int quantity) {
        this.category = category;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        // Implement logic to get total price based on quantity and unit price (if needed)
        return 0.0;
    }
}
