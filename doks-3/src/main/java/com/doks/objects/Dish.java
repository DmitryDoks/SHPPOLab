package com.doks.pojo;

public class Dish {

    private final String name;
    private final Integer cost;

    public Dish(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%s %d$", name, cost);
    }
}
