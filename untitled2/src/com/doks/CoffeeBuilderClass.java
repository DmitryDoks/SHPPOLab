package com.doks;

public class CoffeeBuilderClass implements CoffeeBuilder {
    private CoffeeType type;
    private String producer;
    private double price;
    private boolean sugar;
    @Override public void changeType(CoffeeType type) {
        this.type = type;
    }
    @Override public void setProducer(String producer) {
        this.producer = producer;
    }
    @Override public void setPrice(double price) {
        this.price = price;
    }

    @Override public void putSugar() {
        this.sugar = true;
    }
    @Override public void throwSugar() {
        this.sugar = false;
    }
    public Coffee getResult() {
        return new Coffee(type, producer, price, sugar);
    }
}
