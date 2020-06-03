package com.doks;

public class Coffee implements Product {
    public static final String name = Products.Coffee.name();
    private CoffeeType type;
    private String producer;
    private double price;
    private boolean sugar;
    public Coffee(CoffeeType teaType, String producer, double price, boolean sugar) {
        this.type = teaType;
        this.producer = producer;
        this.price = price;
        this.sugar = sugar;
    }

    public String getName() {
        return this.producer + " " + type.name() + " " + this.name;
    }
    public double getPrice() {
        return price;
    }
    public void changePrice(double price) {
        this.price = price;
    }
    public boolean isSugar() {
        return (sugar) ? true : false;
    }
}
