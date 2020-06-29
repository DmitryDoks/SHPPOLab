package com.doks.factories;

import com.doks.pojo.Dish;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestDishFactory {

    public List<Dish> getDishes() {
        return List.of(
                new Dish("Черный чай", 20),
                new Dish("Зеленый чай", 25),
                new Dish("Кофе", 50)
        );
    }

}
