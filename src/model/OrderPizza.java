package model;

import model.Ingredients;
import model.PieType;
import model.PizzaSize;
import model.SauceType;

public class OrderPizza {
    int id;
    private PizzaSize pizzaSize;
    private SauceType sauceType;
    private PieType pieType;
    private String ingredientsList;

    public OrderPizza(int id, PizzaSize pizzaSize, SauceType sauceType, PieType pieType, String ingredientsList) {
        this.id = id;
        this.pizzaSize = pizzaSize;
        this.sauceType = sauceType;
        this.pieType = pieType;
        this.ingredientsList = ingredientsList;
    }
}


