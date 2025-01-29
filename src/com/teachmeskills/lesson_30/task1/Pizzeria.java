package com.teachmeskills.lesson_30.task1;

import com.teachmeskills.lesson_30.task1.model.Pizza;

import java.util.Scanner;

/**
 * 1. Building a Pizza Ordering App Using the Builder Pattern
 * Description: Create a pizza ordering app that allows users to customize their orders.
 * Apply the Builder pattern to simplify the process of creating a pizza with different toppings.
 * Consider how you can organize the interface for selecting options and how this will affect the final order.
 */
public class Pizzeria {
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

            Pizza pizza = new Pizza.Builder().setSize(size).setCrust(crust).setTomatoes(tomatoes).setCheese(cheese).setSausage(sausage).setMushrooms(mushrooms).setParsley(parsley).build();

            System.out.println("Here is your pizza, " + pizza);

        }catch (Exception e) {
            System.out.println("Data read exception " + e.getMessage());
        }
    }
}