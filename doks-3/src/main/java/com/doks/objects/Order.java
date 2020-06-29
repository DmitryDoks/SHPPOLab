package com.doks.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

    private final List<Dish> dishes;

    private Order(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        final String dishes = this.dishes.stream().map(Dish::toString).collect(Collectors.joining("\n"));
        final Integer cost = this.dishes.stream().map(Dish::getCost).reduce(Integer::sum).get();
        return String.format("----Order start----\n%s\nCost: %d$\n----Order end----\n", dishes, cost);
    }

    public static final class Builder {
        private List<Dish> dishes;

        private Builder() {
            dishes = new ArrayList<>();
        }

        public Builder addDish(Dish dish) {
            this.dishes.add(dish);
            return this;
        }

        public Order build() {
            return new Order(dishes);
        }
    }
}
