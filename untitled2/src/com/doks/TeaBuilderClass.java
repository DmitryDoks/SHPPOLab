package com.doks;

public class TeaBuilderClass implements TeaBuilder {
    private TeaType type;
    private String producer;
    private double price;
    private boolean sugar;
    public void changeType(TeaType type) {
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
    public Tea getResult() {
        return new Tea(type, producer, price, sugar);
    }
}