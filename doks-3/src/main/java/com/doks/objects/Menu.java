package com.doks.pojo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Menu {

    private final List<Dish> dishes;

    public Menu(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Optional<Dish> getDish(String name) {
        return dishes.stream().filter(dish -> dish.getName().equals(name)).findAny();
    }

    @Override
    public String toString() {
        return dishes.stream().map(Dish::toString).collect(Collectors.joining("\n"));
    }
}
