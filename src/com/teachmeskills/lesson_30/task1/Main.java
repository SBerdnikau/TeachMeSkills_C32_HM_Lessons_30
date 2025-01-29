package com.teachmeskills.lesson_30.task1;

import com.teachmeskills.lesson_30.task1.model.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose the pizza size (small, medium, large):");
            String size = sc.nextLine();

            System.out.println("Choose the type of crust (thin, thick):");
            String crust = sc.nextLine();

            System.out.println("Choose the type of ingredients -> ");

            System.out.println("Add mushrooms? (true/false):");
            boolean mushrooms = Boolean.parseBoolean(sc.nextLine());
            System.out.println("Add cheese? (true/false):");
            boolean cheese = Boolean.parseBoolean(sc.nextLine());
            System.out.println("Add tomatoes? (true/false):)");
            boolean tomatoes = Boolean.parseBoolean(sc.nextLine());
            System.out.println("Add sausage? (true/false):");
            boolean sausage = Boolean.parseBoolean(sc.nextLine());
            System.out.println("Add parsley? (true/false):");
            boolean parsley = Boolean.parseBoolean(sc.nextLine());

            Pizza pizza = new Pizza.PizzaBuilder().setSize(size).setCrust(crust).setTomatoes(tomatoes).setCheese(cheese).setSausage(sausage).setMushrooms(mushrooms).setParsley(parsley).build();

            System.out.println("Here is your pizza, " + pizza);

        }catch (Exception e) {
            System.out.println("Data read exception " + e.getMessage());
        }
    }
}