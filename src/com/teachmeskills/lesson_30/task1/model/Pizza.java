package com.teachmeskills.lesson_30.task1.model;

public class Pizza {
    private String size;
    private String crust;
    private boolean cheese;
    private boolean tomatoes;
    private boolean mushrooms;
    private boolean sausage;
    private boolean parsley;

    public static class Builder {
        private final Pizza pizza;

        public Builder() {
            pizza = new Pizza();
        }

        public Builder setSize(String size) {
            pizza.size = size;
            return this;
        }

        public Builder setCrust(String crust) {
            pizza.crust = crust;
            return this;
        }

        public Builder setCheese(boolean cheese) {
            pizza.cheese = cheese;
            return this;
        }

        public Builder setTomatoes(boolean tomatoes) {
            pizza.tomatoes = tomatoes;
            return this;
        }

        public Builder setMushrooms(boolean mushrooms) {
            pizza.mushrooms = mushrooms;
            return this;
        }

        public Builder setSausage(boolean sausage) {
            pizza.sausage = sausage;
            return this;
        }

        public Builder setParsley(boolean parsley) {
            pizza.parsley = parsley;
            return this;
        }

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