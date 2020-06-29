package com.doks;

import com.doks.factories.TestDishFactory;
import com.doks.pojo.Dish;
import com.doks.pojo.Menu;
import com.doks.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class DoksApplication implements CommandLineRunner {

	@Autowired
	private TestDishFactory testDishFactory;

	public static void main(String[] args) {
		SpringApplication.run(DoksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(new String(DoksApplication.class.getResourceAsStream("/logo").readAllBytes()) + "\n");
		final List<Dish> dishes = testDishFactory.getDishes();
		final Menu menu = new Menu(dishes);

		final Dish blackTea = menu.getDish("Черный чай").get();
		final Dish greenTea = menu.getDish("Зеленый чай").get();
		final Dish coffee = menu.getDish("Кофе").get();

		new Thread(() -> {
			final Order order = Order.builder()
					.addDish(blackTea)
					.addDish(greenTea)
					.build();
			System.out.println(order);
		}).start();

		new Thread(() -> {
			final Order order = Order.builder()
					.addDish(coffee)
					.build();
			System.out.println(order);
		}).start();
	}
}
