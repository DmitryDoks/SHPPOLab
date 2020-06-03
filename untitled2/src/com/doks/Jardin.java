package com.doks;

public class Jardin implements CoffeeProducer {
    public static final String producer = CoffeeProducers.Jardin.name();
    private CoffeeBuilderClass coffeeBuilder = new CoffeeBuilderClass();

    @Override
    public Coffee constructBlackCoffee(double price) {
        this.coffeeBuilder.setProducer(producer);
        this.coffeeBuilder.setPrice(price);
        this.coffeeBuilder.changeType(CoffeeType.Black);
        return this.coffeeBuilder.getResult();
    }

    @Override
    public Coffee constructBlackCoffee(double price, boolean sugar) {
        this.coffeeBuilder.setProducer(producer);
        this.coffeeBuilder.setPrice(price);
        this.coffeeBuilder.changeType(CoffeeType.Black);
        if (sugar) this.coffeeBuilder.putSugar();
        return this.coffeeBuilder.getResult();
    }

    @Override
    public Coffee constructMilkCoffee(double price) {
        this.coffeeBuilder.setProducer(producer);
        this.coffeeBuilder.setPrice(price);
        this.coffeeBuilder.changeType(CoffeeType.Milky);
        return this.coffeeBuilder.getResult();
    }

    @Override
    public Coffee constructMilkCoffeeWithSugar(double price) {
        this.coffeeBuilder.setProducer(producer);
        this.coffeeBuilder.setPrice(price);
        this.coffeeBuilder.changeType(CoffeeType.Milky);
        this.coffeeBuilder.putSugar();
        return this.coffeeBuilder.getResult();
    }
}
