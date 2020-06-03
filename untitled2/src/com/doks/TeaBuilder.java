package com.doks;

public interface TeaBuilder {
    void changeType(TeaType type);
    void setProducer(String producer);
    void setPrice(double price);
    void putSugar();
    void throwSugar();
}
