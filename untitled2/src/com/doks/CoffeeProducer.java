package com.doks;

public interface CoffeeProducer {
    Coffee constructBlackCoffee(double price);
    Coffee constructBlackCoffee(double price, boolean sugar);
    Coffee constructMilkCoffee(double price);
    Coffee constructMilkCoffeeWithSugar(double price);
}
