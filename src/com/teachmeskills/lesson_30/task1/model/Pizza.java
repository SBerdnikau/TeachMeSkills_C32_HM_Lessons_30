package com.teachmeskills.lesson_30.task1.model;

public class Pizza {
    private String size;
    private String crust;
    private boolean cheese;
    private boolean tomatoes;
    private boolean mushrooms;
    private boolean sausage;
    private boolean parsley;

    public static class PizzaBuilder implements Ingredient {
        Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        @Override
        public PizzaBuilder setSize(String size) {
            pizza.size = size;
            return this;
        }

        @Override
        public PizzaBuilder setCrust(String crust) {
            pizza.crust = crust;
            return this;
        }

        @Override
        public PizzaBuilder setCheese(boolean cheese) {
            pizza.cheese = cheese;
            return this;
        }

        @Override
        public PizzaBuilder setTomatoes(boolean tomatoes) {
            pizza.tomatoes = tomatoes;
            return this;
        }

        @Override
        public PizzaBuilder setMushrooms(boolean mushrooms) {
            pizza.mushrooms = mushrooms;
            return this;
        }

        @Override
        public PizzaBuilder setSausage(boolean sausage) {
            pizza.sausage = sausage;
            return this;
        }

        @Override
        public PizzaBuilder setParsley(boolean parsley) {
            pizza.parsley = parsley;
            return this;
        }

        @Override
        public Pizza build() {
            return pizza;
        }

    }

    @Override
    public String toString() {
        return " Order_pizza: " +
                "size=" + size +
                ", crust=" + crust +
                ", cheese=" + cheese +
                ", tomatoes=" + tomatoes +
                ", mushrooms=" + mushrooms +
                ", sausage=" + sausage +
                ", parsley=" + parsley;
    }
}