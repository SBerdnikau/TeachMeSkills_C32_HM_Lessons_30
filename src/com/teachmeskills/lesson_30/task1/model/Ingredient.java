package com.teachmeskills.lesson_30.task1.model;

public interface Ingredient {
    Pizza.PizzaBuilder setSize(String size);
    Pizza.PizzaBuilder setCrust(String crust);
    Pizza.PizzaBuilder setCheese(boolean cheese);
    Pizza.PizzaBuilder setTomatoes(boolean tomatoes);
    Pizza.PizzaBuilder setMushrooms(boolean mushrooms);
    Pizza.PizzaBuilder setSausage(boolean sausage);
    Pizza.PizzaBuilder setParsley(boolean parsley);
    Pizza build();
}
