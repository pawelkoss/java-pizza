package service;

import com.sun.javafx.fxml.PropertyNotFoundException;
import model.*;

import java.util.*;

public class OrderService {
    PizzaRepository pizzaRepository = new PizzaRepository();

    public void orderPizza(int id, PizzaSize pizzaSize, SauceType sauceType, PieType pieType, String ingredientsList) {

        String[] arrOfIngs = ingredientsList.split(" ");
        System.out.println(Arrays.toString(arrOfIngs));

        Set<Ingredients> ingredientsSet = new HashSet<>();

        for (String ing : arrOfIngs) {
            ingredientsSet.add(new Ingredients("", IngredientType.valueOf(ing)));
        }

        Pizza pizza = pizzaRepository.findPizzaById(id);
        pizza.setPizzaSize(pizzaSize);
        pizza.setSauceType(sauceType);
        pizza.setPieType(pieType);
        pizza.setIngredients(ingredientsSet);

        System.out.println("nowe zamówienie");
        System.out.println(pizza.toString());

    }

    public void giveMePizzaWith(String ingredient) {

        Set<Pizza> pizzaFindedSet2 = pizzaRepository.findPizzaByIngredient2(ingredient);

        if (pizzaFindedSet2.isEmpty()) {
            throw new IllegalArgumentException("Cannot find pizza with ingredient " + ingredient);
        } else {
            pizzaFindedSet2.forEach(x -> System.out.println(x));
        }

    }
    public void giveMePizzaSize(String size) {

        try{
            PizzaSize sizeE = PizzaSize.valueOf(size.toUpperCase());

            System.out.println(sizeE);
            Set<Pizza> pizzaFindedSet3 = pizzaRepository.findPizzaBySize(sizeE);

            pizzaFindedSet3.forEach(x -> System.out.println(x));

        }catch (IllegalArgumentException ex){
            System.out.println("Cannot find pizza with size " + size);
        }
    }

    public void findTheBestPizzaByPrice(Double maxPrice) {
        Optional<Pizza> pizzaFindedSet4 = pizzaRepository.findPizzaByPrice(maxPrice);

        pizzaFindedSet4.ifPresent(pizza -> System.out.println(pizzaFindedSet4.get()));  // jesli nie znajdzie brak komunikatu
        pizzaFindedSet4.orElseThrow(()-> new PropertyNotFoundException("Too low price"));

    }

    // todo: edycja zamówienia
    // todo: usuniecie zamówienie
    //

}
