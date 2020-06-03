package com.doks;

public interface CoffeeBuilder {
    void changeType(CoffeeType type);
    void setProducer(String producer);
    void setPrice(double price);
    void putSugar();
    void throwSugar();
}
