package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100),
    PREMIUM("Premium Plan", 250);  // Semicolon here

    private final String name;  // `final` added for immutability (optional)
    private final int price;  // `final` added for immutability (optional)

    // Constructor
    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
