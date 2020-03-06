package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pizza implements Comparable<Pizza> {
    private int id;
    private String name;
    private double price;
    private PizzaSize pizzaSize;
    private SauceType sauceType;
    private PieType pieType;
    private Set<Ingredients> ingredients = new HashSet<>();


    public Pizza(int id, String name, double price, PizzaSize pizzaSize, SauceType sauceType, PieType pieType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pizzaSize = pizzaSize;
        this.sauceType = sauceType;
        this.pieType = pieType;
    }

    public Pizza(int id, PizzaSize pizzaSize, SauceType sauceType, PieType pieType, Set<Ingredients> ingredients) {
        this.id = id;
        this.pizzaSize = pizzaSize;
        this.sauceType = sauceType;
        this.pieType = pieType;
        this.ingredients = ingredients;
    }


    public double getPrice() {      // obliczanie ceny pizzy po dodatkach z enum

        double price = this.price + pizzaSize.getSizePrice() + pieType.getPiePrice();
        for (Ingredients ing : ingredients) {
            price += ing.getIngedientType().getIngredientPrice();
        }

        return price;
    }

    public Pizza addIngredients(Ingredients ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public int getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }

    public Set<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public PieType getPieType() {
        return pieType;
    }

    public void setPieType(PieType pieType) {
        this.pieType = pieType;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + getPrice() +
                ", pizzaSize=" + pizzaSize +
                ", sauceType=" + sauceType +
                ", ingredients=" + ingredients +
                ", pieType=" + pieType +
                '}';
    }

    @Override
    public int compareTo(Pizza o) {
        if (this.getPrice() < o.getPrice()) return -1;
        if (this.getPrice() > o.getPrice()) return 1;
        else return 0;
    }



}